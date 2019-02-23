/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pamelaeva
 */
public class StoreUnit {
 private String m_strName;
 private int m_iPrice;
 private int m_iQuantity;

    public String getName() {
        return m_strName;
    }

    public void setName(String p_strName) {
        m_strName = p_strName;
    }

    public int getiPrice() {
        return m_iPrice;
    }

    public void setiPrice(int p_iPrice) {
        m_iPrice = p_iPrice;
    }

    public int getiQuantity() {
        return m_iQuantity;
    }

    public void setiQuantity(int p_iQuantity) {
        m_iQuantity = p_iQuantity;
    }
 
    public int getCost() {
    int iPrice= getiPrice();
    int iQuantity= getiQuantity();
    int iResult = iPrice * iQuantity;
    return iResult;
    
    }

    public StoreUnit(String p_strName, int p_iPrice, int p_iQuantity) {
        setName (p_strName);
        setiPrice (p_iPrice);
        setiQuantity (p_iQuantity);
    }
    
}
