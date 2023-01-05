package bdbt_proj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedList;
import java.util.List;

@Controller
public class AppController {
    @Autowired
    private AdresyDAO dao;

    @RequestMapping(value = "/")
    public String viewHomePage(Model model){
        List<Adres> listAdresy=dao.list();
        model.addAttribute("listAdresy",listAdresy);
        return "index1";
    }

    @RequestMapping("/new")
    public String newNewForm(Model model){
        Adres adresy= new Adres();
        model.addAttribute("adresy",adresy);

        return "new_form";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@ModelAttribute("adres") Adres adres) {
        dao.save(adres);

        return "redirect:/";
    }

}
