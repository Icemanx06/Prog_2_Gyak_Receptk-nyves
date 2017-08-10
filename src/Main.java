import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;


class hozzavalok implements Comparable<hozzavalok>{
    String hnev;
    LinkedList<recept> etelek = new LinkedList<>();

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final hozzavalok other = (hozzavalok) obj;
        if (!Objects.equals(this.hnev, other.hnev)) {
            return false;
        }
        if (!Objects.equals(this.etelek, other.etelek)) {
            return false;
        }
        return true;
    }
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(hnev).append(":");
         for (int i = 0; i < etelek.size(); i++) {
             if(i==etelek.size()-1){
                 sb.append(etelek.get(i));
             }else{
                 sb.append(etelek.get(i)).append(",");
             }
         }
         return sb.toString();
    }

    @Override
    public int compareTo(hozzavalok o) {
        return this.hnev.compareTo(o.hnev);
    }
    
}

class recept implements Comparable<recept>{
    String nev;

    public recept(String nev) {
        this.nev = nev;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final recept other = (recept) obj;
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nev;
    }

    @Override
    public int compareTo(recept o) {
       return this.nev.compareTo(o.nev);
    }

   
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<hozzavalok> list = new LinkedList<>();
//        int db = 0;
//        while(db<4){
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(":");
            String[] hozzav = line[1].split(",");
            recept ujrecept = new recept(line[0]);
            for (int i = 0; i < hozzav.length; i++) {
                if(list.isEmpty()){
                    hozzavalok ujhozzavalo = new hozzavalok();
                    ujhozzavalo.hnev=hozzav[i];
                    ujhozzavalo.etelek.add(ujrecept);
                    list.add(ujhozzavalo);
                }else{
                    boolean van = false;
                    int index = 0;
                    for (int j = 0; j < list.size(); j++) {
                        if(list.get(j).hnev.equals(hozzav[i])){
                            index  = j;
                            van = true;
                        }
                    }
                    if(van){
                        list.get(index).etelek.add(ujrecept);
                        van = false;
                        index = 0;
                    }else{
                       hozzavalok ujhozzavalo = new hozzavalok();
                        ujhozzavalo.hnev=hozzav[i];
                        ujhozzavalo.etelek.add(ujrecept);
                        list.add(ujhozzavalo);  
                    }
                }
            }
//           db++; 
        }
        Collections.sort(list);
        for (hozzavalok object : list) {
            Collections.sort(object.etelek);
        }
      
        for (hozzavalok l : list) {
            System.out.println(l);
        }
    }
}