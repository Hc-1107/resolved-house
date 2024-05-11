package com.huang.controller;

import com.huang.entity.Role;
import com.huang.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    private final static String LIST_ACTION = "redirect:/role";
    private final static String PAGE_INDEX = "role/index";
    private final static String PAGE_CREATE = "role/create";
    private final static String PAGE_EDIT = "role/edit";
    private final static String PAGE_SUCCESS = "common/successPage";

    @Autowired
    private RoleService roleService;

    @GetMapping
    public String findAll(ModelMap modelMap){

        List<Role> roleList = roleService.findAllRoles();

        modelMap.addAttribute("list", roleList);

        return "role/index";
    }

    @GetMapping("create")
    public String toCreate(){

        return "role/create";
    }

    @PostMapping("addOne")
    public String addOne(Role role){

        roleService.addOne(role);
        return "common/successPage";
    }

    @GetMapping("edit/{id}")
    public String getOne(Model model, @PathVariable Long id){
        Role role = roleService.getOne(id);
        model.addAttribute("role", role);
        return PAGE_EDIT;
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String updateOne(Role role){
        roleService.updateOne(role);
        return PAGE_SUCCESS;
    }
}
