/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.yohanasrirejeki.latihanmvcjdbc.event;

import edu.yohanasrirejeki.latihanmvcjdbc.entity.Pelanggan;
import edu.yohanasrirejeki.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author 10119044 Yohana Sri Rejeki IF2
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);


    

    
}
