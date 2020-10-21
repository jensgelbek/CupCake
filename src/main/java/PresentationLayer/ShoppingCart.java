package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart extends Command {
     @Override
        String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

         int number = Integer.parseInt(request.getParameter("number"));
         String bottom = request.getParameter("bottom");
         String topping = request.getParameter("topping");

         request.setAttribute("number", number);
         request.setAttribute("bottom", bottom);
         request.setAttribute("topping", topping);



         /*

            try {
                height = Double.parseDouble(request.getParameter("height"));
                weight = Double.parseDouble(request.getParameter("weight"));
            } catch (Exception e) {
                throw new LoginSampleException("Du skal indtsate et tal som højde og vægt");
            }


            Double bmi = BmiHelperFunctions.calcBmi(height, weight);
            String kategori = BmiHelperFunctions.findKategori(bmi);
            String bmi_to_dec = String.format("%.2f", bmi);

            String gender = request.getParameter("gender");

            int sport = 0;

            try {
                sport =
                        Integer.parseInt(request.getParameter("sport"));
            } catch (Exception e) {
                throw new LoginSampleException("Fejl i sport parameter");
            }

            String[] infos = request.getParameterValues("info");

            List<String> infoList = null;
            if ( infos != null ) {
                infoList = Arrays.asList(infos);
            }

            request.setAttribute("height", height);
            request.setAttribute("weight", weight);

            request.setAttribute("kategori", kategori);
            request.setAttribute("bmi", bmi_to_dec);
            request.setAttribute("weightlosses", Weightlosses.getWeightlosses());

            request.setAttribute("gender", gender);
            request.setAttribute("sport", sport);
            request.setAttribute("infos", infoList);

            LogicFacade.insertBmiItem(height, weight, kategori, bmi, gender, sport ,infoList);

            return "resultat";

          */
         return "shoppingCart";


        }
    }

