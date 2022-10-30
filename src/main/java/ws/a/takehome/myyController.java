/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.a.takehome;

import java.io.IOException;
import java.nio.file.Paths;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    
    public class ImageUpload {
    @RequestMapping(value = "getimage/{photo}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<ByteArrayResource> getImage(@PathVariable("photo")String photo) throws IOException{
        if (!photo.equals("")|| photo !=null) {
            try{
                Path filename = Paths.get("uploads",photo);
                byte[] buffer = Files.readAllBytes(filename);
                ByteArrayResource byteArrayResource = new ByteArrayResource(buffer);
                return ResponseEntity.ok()
                        .contentLength(buffer.length)
                        .contentType(MediaType.IMAGE_PNG.parseMediaType("image/png"))
                        .body(byteArrayResource);
            }catch (Exception e) {
            }
            
        }
        return ResponseEntity.badRequest().build();
    }
   
    }
    
}
