package tugas4;

import java.util.ArrayList;

public class Warteg extends TempatMakan{

    public Warteg(String nama) {
        super(nama);
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public ArrayList<Menu> getListMenu() {
        return super.getListMenu();
    }

    @Override
    public void setListMenu(ArrayList<Menu> listMenu) {
        super.setListMenu(listMenu);
    }

    @Override
    public void addMenu(Menu menu) {
        Menu newMenu = super.getMenu(menu.getNama());
        if(newMenu == null){
            super.addMenu(menu);
            System.out.println("Menu " + menu.getNama() + " berhasil ditambah ke daftar!");
        }
        else{
            System.out.println("Menu " + menu.getNama() + " sudah ada dalam daftar!");
        }
    }
}
