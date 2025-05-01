package controller;

import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import view.FormLihatKaryawan;
import model.Pekerjaan;
import model.PekerjaanDao;


public class GajiController {

    private JTable gajiTable; // simpan referensi JTable-nya

    // Setter dipanggil sekali dari Form utama
    public void setGajiTable(JTable gajiTable) {
        this.gajiTable = gajiTable;
    }
    
    private final PekerjaanDao pekerjaanDao = new PekerjaanDao();


    public void cariPekerjaan(String kode) {
        Pekerjaan p = pekerjaanDao.cariByKode(kode);
        if (p != null) {
            int row = gajiTable.getSelectedRow();
            gajiTable.setValueAt(p.getNama(), row, 1); // kolom nama pekerjaan
            gajiTable.setValueAt(p.getGaji(), row, 2); // kolom gaji
        } else {
            JOptionPane.showMessageDialog(null, "Pekerjaan tidak ditemukan.");
        }
    }

    public void cariKaryawan(JTextField ktpField) {
        String ktp = ktpField.getText().trim();
        if (ktp.isEmpty()) {
            System.out.println("KTP kosong!");
            return;
        }

        // Simulasi pencarian
        System.out.println("Mencari karyawan dengan KTP: " + ktp);

        // Contoh: Karyawan k = karyawanDao.cariByKtp(ktp);
        // lalu update tampilan jika perlu
    }

    public void tampilkanFormLihatKaryawan() {
        FormLihatKaryawan dialog = new FormLihatKaryawan();
        dialog.setVisible(true);
    }

public void simpan(JTextField ktpField, JTable gajiTable) {
    String ktp = ktpField.getText().trim();
    if (ktp.isEmpty()) {
        System.out.println("KTP tidak boleh kosong.");
        return;
    }

    DefaultTableModel model = (DefaultTableModel) gajiTable.getModel();

    for (int i = 0; i < model.getRowCount(); i++) {
        Object kode = model.getValueAt(i, 0);
        Object namaPekerjaan = model.getValueAt(i, 1);
        Object gajiBersih = model.getValueAt(i, 2);
        Object gajiKotor = model.getValueAt(i, 3);
        Object tunjangan = model.getValueAt(i, 4);

        if (kode == null || kode.toString().isEmpty()) continue;

        System.out.println("Menyimpan data:");
        System.out.println("KTP: " + ktp);
        System.out.println("Kode: " + kode);
        System.out.println("Nama Pekerjaan: " + namaPekerjaan);
        System.out.println("Gaji Bersih: " + gajiBersih);
        System.out.println("Gaji Kotor: " + gajiKotor);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("------------------------------");
    }
}
}

