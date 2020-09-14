package Testing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nimantha
 */
public class NewClass {

    public static void main(String[] args) {
        String s = "INSERT INTO `central_insdustries`.`raw_stock` (`idraw_stock`, `id_rawMatrial`, `qty`, `unit_price`, `mfd`, `expdate`, `color_grade`, `state`) VALUES".replace("`", "");
        s = "INSERT INTO `central_insdustries`.`bom_item` (`idbom_item`, `job_id`, `idraw_stock`, `unit`, `qty`) VALUES".replace("`", "");
        System.out.println(s);
    }
}
