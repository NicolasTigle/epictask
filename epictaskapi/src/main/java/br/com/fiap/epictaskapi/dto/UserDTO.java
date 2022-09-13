package br.com.fiap.epictaskapi.dto;

import br.com.fiap.epictaskapi.model.User;

public class UserDTO {
    
    private String name;
    private String email;

    public User transformaParaObjeto(){
        return new User(name, email);
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
