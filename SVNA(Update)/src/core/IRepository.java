/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package core;

/**
 *
 * @author gabri
 * @param <T>
 * @param <I>
 */
public interface IRepository <T,I>{
   
    public abstract void saveAggregate(T aggregate);
    public abstract T findOneById(I id);
    
}
