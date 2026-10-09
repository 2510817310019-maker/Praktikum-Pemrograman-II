package module02.problem03;

// Pada baris ini terjadi error karena class public harus bernama sama dengan nama file (Employee.java), sedangkan nama class-nya Pegawai
// public class Pegawai {
public class Employee {
    public String name;

    // Pada baris ini terjadi error karena origin bertipe char (hanya bisa menampung 1 karakter), sedangkan nilainya adalah String "Kingdom of Orvel"
    // public char origin;
    public String origin;

    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        // Method ini mengembalikan String, jadi atribut origin harus bertipe String (sudah diperbaiki pada deklarasi di atas)
        return origin;
    }

    // Pada baris ini terjadi error karena method tidak memiliki parameter, padahal dipanggil dengan setRole("Assasin")
    // public void setRole() {
    public void setRole(String r) {
        // Pada baris ini terjadi error karena variabel r tidak dideklarasikan; sekarang r adalah parameter method di atas
        this.role = r;
    }
}