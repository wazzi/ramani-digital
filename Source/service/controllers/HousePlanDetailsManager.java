/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.controllers;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author kelly
 */
@Named(value = "planDetails")
@SessionScoped
public class HousePlanDetailsManager implements Serializable {

    /**
     * Creates a new instance of HousePlanDetailsManager
     */
    public HousePlanDetailsManager() {
    }
    
}
