/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Renter;
import utils.RenterStorage;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class RenterController {
    
    private final ArrayList<Renter> renters;
    private final DefaultTableModel tableModel;

    public RenterController(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
        this.renters = RenterStorage.loadRenters();
        refreshTable();
    }

    public void addRenter(String name, String address, int cottages,
                          String size, int price) {

        Renter renter = new Renter(
                name, address, cottages, size, price, "Unpaid");

        renters.add(renter);
        saveAndRefresh();
    }

    public void removeRenter(int row) {
        if (row < 0 || row >= tableModel.getRowCount()) {
            JOptionPane.showMessageDialog(
                    null, "Please select a renter to remove.");
            return;
        }

        int modelRow = row;
        renters.remove(modelRow);
        saveAndRefresh();
    }

    public void markPaid(int row) {
        updateStatus(row, "Paid");
    }

    public void markUnpaid(int row) {
        updateStatus(row, "Unpaid");
    }

    private void updateStatus(int row, String status) {
        if (row < 0 || row >= tableModel.getRowCount()) {
            JOptionPane.showMessageDialog(
                    null, "Please select a renter first.");
            return;
        }

        renters.get(row).setStatus(status);
        saveAndRefresh();
    }

    private void saveAndRefresh() {
        RenterStorage.saveRenters(renters);
        refreshTable();
    }

    private void refreshTable() {
        tableModel.setRowCount(0);

        for (Renter renter : renters) {
            tableModel.addRow(new Object[]{
                renter.getCustomerName(),
                renter.getCustomerAddress(),
                renter.getCustomerCottage(),
                renter.getCottageSize(),
                "₱" + renter.getTotalPrice(),
                renter.getStatus()
            });
        }
    }
    
}
