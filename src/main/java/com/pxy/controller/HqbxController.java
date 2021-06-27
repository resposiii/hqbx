package com.pxy.controller;

import com.pxy.pojo.Bxxx;
import com.pxy.service.HqbxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/hqbx")
public class HqbxController {

    @Autowired
    @Qualifier("HqbxServiceImpl")
    private HqbxService hqbxService;

    @RequestMapping("/allBxxx")
    public String list(Model model,String msg){
        model.addAttribute("msg",msg);
        List<Bxxx> bxxxes = hqbxService.queryAllBxxx();
        model.addAttribute("bxxxes",bxxxes);
        return "allBxxx";
    }

    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("/add")
    public String add(Bxxx bxxx){
        hqbxService.addBxxx(bxxx);
        return "redirect:/hqbx/allBxxx";
    }

    @RequestMapping("/toUpdateBxxx")
    public String toUpdateBxxx(Model model,int id){
        Bxxx bxxx = hqbxService.queryBxxxById(id);
        if("已处理".equals(bxxx.getZt())){
            model.addAttribute("msg","无法修改,请联系管理人员");
            return "redirect:/hqbx/allBxxx";
        }
        model.addAttribute("bxxx",bxxx);
        return "updateBxxx";
    }

    @RequestMapping("/updateBxxx")
    public String updeBxxx(Bxxx bxxx){
        hqbxService.updateBxxx(bxxx);
        return "redirect:/hqbx/allBxxx";
    }


    @RequestMapping("/del/{bxxxDh}")
    public String deleteBxxx(@PathVariable("bxxxDh") int id,Model model){
        Bxxx bxxx = hqbxService.queryBxxxById(id);
        if("待处理".equals(bxxx.getZt())) {
            hqbxService.deleteBxxxById(id);
            model.addAttribute("msg","删除成功");
            return "redirect:/hqbx/allBxxx";
        }
        model.addAttribute("msg","无法删除,请联系管理人员");
        return "redirect:/hqbx/allBxxx";


    }


}
