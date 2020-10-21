package FunctionLayer;

import DBAccess.UserMapper;

import javax.faces.view.facelets.FaceletContext;
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
        List<Bottom> retval=new ArrayList<Bottom>();
        retval.add(new Bottom(1,"bottom1",5));
        retval.add(new Bottom(2,"bottom2",5));
        return retval;
    }

    public static List<Top> getAllToppings (){
        List<Top> retval=new ArrayList<Top>();
        retval.add(new Top(1,"top1",5));
        retval.add(new Top(2,"top2",5));
        return retval;

    }

}
