/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan47.nilaimahasiswa;

/**
 *
 * @author MERDEFI
 */
public class Nilai {
    private double quiz, uts, uas, nilaiAkhir ;
    private char index;
    
    public Nilai(double quiz, double uts, double uas){
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    public double getQuiz() {
        return quiz;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }

    public double getNilaiAkhir(double quiz, double uts, double uas) {
        return nilaiAkhir = (quiz*0.2)+(uts*0.3)+(uas*0.5);
    }

    public char getIndex(double na) {
        if(80 < na && na <= 100){
            index = 'A';
        }else if(68 < na && na <= 80){
            index = 'B';
        }else if(56 < na && na <= 68){
            index = 'C';
        }else if(45 < na && na <= 56){
            index = 'D';
        }else{
            index = 'E';
        }
        
        return index;
    }
    
    private String keterangan(char index){
        switch(index){
            case 'A' : return "Sangat Baik";
            case 'B' : return "Baik";
            case 'C' : return "Cukup";
            case 'D' : return "Kurang";
        default : return "Sangat Kurang";
       }
    }
    
    public void tampilNilai(double quiz, double uts, double uas, double nilaiAkhir, char index){
        System.out.println("QUIZ        = " + quiz);
        System.out.println("UTS         = " + uts);
        System.out.println("UAS         = " + uas);
        System.out.println();
        System.out.println("NILAI AKHIR = " + nilaiAkhir);
        System.out.println();
        System.out.println("INDEX       = " + index);
        System.out.println("KETERANGAN  = " + keterangan(index));
    }
 

   
    
}
