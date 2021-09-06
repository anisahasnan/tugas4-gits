package tugas4;

import java.util.ArrayList;

public class TempatMakan {
    String nama;
    ArrayList<Menu> listMenu = new ArrayList<>();

    public TempatMakan(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Menu> getListMenu() {
        return listMenu;
    }

    public void setListMenu(ArrayList<Menu> listMenu) {
        this.listMenu = listMenu;
    }

    public void addMenu(Menu menu){
        listMenu.add(menu);
    }

    public Menu getMenu(String nama){
        for(Menu menu: listMenu){
            if(menu.getNama().equalsIgnoreCase(nama)){
                return menu;
            }
        }
        return null;
    }

    public void getAllMenu(){
        int i = 0;
        for(Menu menu: listMenu){
            System.out.println(++i + ". " + menu.getNama() + " - Rp" + menu.getHarga());
        }
    }
}
