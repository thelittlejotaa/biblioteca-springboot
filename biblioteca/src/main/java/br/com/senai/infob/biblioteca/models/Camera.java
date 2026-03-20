package br.com.senai.infob.biblioteca.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="camera")
public class Camera {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="camera_id")
    private int cameraId;

    //foreing key com setor
    public Camera() {
    }

    public int getCameraId() {
        return cameraId;
    }

    public void setCameraId(int cameraId) {
        this.cameraId = cameraId;
    }

    
}