package br.com.senai.infob.biblioteca.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PrintCamera")
public class PrintCamera {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="PrintCamera")
    private int PrintCameraId;
    
    @Column(name="Validação")
    private int Validação;

    public PrintCamera() {
    }

    public int getPrintCameraId() {
        return PrintCameraId;
    }

    public void setPrintCameraId(int printCameraId) {
        PrintCameraId = printCameraId;
    }

    public int getValidação() {
        return Validação;
    }

    public void setValidação(int validação) {
        Validação = validação;
    }
}

