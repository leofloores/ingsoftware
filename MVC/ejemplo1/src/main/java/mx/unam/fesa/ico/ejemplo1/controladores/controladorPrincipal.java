package mx.unam.fesa.ico.ejemplo1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import mx.unam.fesa.ico.ejemplo1.modelo.juguetes;

@Controller
@RequestMapping("/Tienda")
public class controladorPrincipal {

    @GetMapping("/adultos")
    public String mostrarAdultos(){
        return "pagina_uno";
    }

    @GetMapping("/Mascotas")
    public String mostrarMascotas(Model model){
        comida com = new comida("https://m.media-amazon.com/images/I/51FSMd+yZwL._AC_SX679_.jpg",
         "Croquetas Pedigree", 450.0f
          );  
          model.addAttribute("comida", com);
        return "masc";
    }

    @GetMapping("/juguetes")
    public String mostrarJuguetes(Model model){
        juguetes juguete = new juguetes("https://via.placeholder.com/300x200",
         "Pelota de futbol", 150.0f
          );  
          model.addAttribute("juguete", juguete);
        return "juguetes";
    }
}