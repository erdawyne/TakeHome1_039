/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.a.takehome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author ERDA WYNE
 */
@Controller
public class myyController {
    
    @RequestMapping("/save")
    @ResponseBody
    public String tugas(
            
            @RequestParam(value="varA") String nama,
            @RequestParam(value="varB") String alamat,
            @RequestParam(value="varC") String gambar,
   
            return result = "";
    )
    
    
    
    
    @RequestMapping("/nextpage")
    
    public String next(
            @RequestParam (value = "varA") String nama,
            @RequestParam(value="varB") String alamat,
            @RequestParam(value="varC") String gambar,
            Model kurir
            ){
                kurir.addAttribute("paket1", nama);
                kurir.addAttribute("paket2", alamat);
                
                return "view";
                
    }
    
                

}
