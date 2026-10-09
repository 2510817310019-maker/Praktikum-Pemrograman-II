package module02.problem03;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();

        // Pada baris ini terjadi error karena kurangnya titik koma (;)
        // e.name = "Roi"
        e.name = "Roi";

        // Pada baris ini terjadi error karena origin bertipe char sehingga tidak bisa diisi String (diperbaiki dengan mengubah tipe origin menjadi String di Employee.java)
        e.origin = "Kingdom of Orvel";

        // Pada baris ini terjadi error karena method setRole di Employee tidak menerima parameter (diperbaiki dengan menambahkan parameter String di Employee.java)
        e.setRole("Assasin");

        // Pada baris ini umur tidak pernah diisi sehingga tercetak 0, padahal output meminta 17
        // (tidak ada baris sebelumnya)
        e.age = 17;

        // Pada baris ini output tidak sesuai dengan soal, seharusnya "Nama: Roi" bukan "Nama Pegawai: Roi"
        // System.out.println("Nama Pegawai: " + e.getName());
        System.out.println("Nama: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);

        // Pada baris ini output kurang kata "tahun" di belakang umur
        // System.out.println("Umur: " + e.age);
        System.out.println("Umur: " + e.age + " tahun");
    }
}