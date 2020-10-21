package FunctionLayer;

import DBAccess.BottomMapper;
import DBAccess.TopMapper;
import DBAccess.UserMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    public static List<Bottom> getAllBottoms (){
        List<Bottom> retval=null;
        try {
            retval = BottomMapper.getAllBottoms();
        }catch (DBException e){
            retval=new ArrayList<>();
        }
        return retval;
    }

    public static List<Top> getAllToppings (){
        List<Top> retval=null;
        try {
             retval = TopMapper.getAllToppings();
        }catch (DBException e){
            retval=new ArrayList<>();
        }
        return retval;
    }

}
