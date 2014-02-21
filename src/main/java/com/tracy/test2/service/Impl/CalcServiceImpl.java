/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.test2.service.Impl;

import com.tracy.test2.service.CalcService;

/**
 *
 * @author student
 */
public class CalcServiceImpl implements CalcService{

    public String failMessage(String a) {
        return a;
    }
    public int divide(int a, int b){
        return a/b;
    }
    
}
