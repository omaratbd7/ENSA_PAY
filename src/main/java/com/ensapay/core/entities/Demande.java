package com.ensapay.core.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Document(collection = "demandes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Demande {

    @Id
    private String id;
    private String type_cmpte;
    private String nom;
    private String prenom;
    private String tel;
    private String email;
    private boolean resolu;

}
