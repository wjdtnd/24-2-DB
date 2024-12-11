package _GUI.View;

import _GUI.entity.OrderEntity;
import _GUI.repository.OrderRepository;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class OrderInfoView extends JPanel {

    JPanel panN = new JPanel(new GridLayout(2,1));
    JPanel panC = new JPanel(new BorderLayout());

    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();

    JTextField tfSearch = new JTextField(20);
    DefaultTableModel tableModel = new DefaultTableModel();
    JTable table;

    String[] header = {"주문번호", "주문고객", "주문제품", "수량", "배송지", "주문일자"};

    public OrderInfoView() {
        setLayout(new BorderLayout(5,20));  //  Flowlayout => BorderLayout으로 설정

        panN.add(pan1);
        panN.add(pan2);

        add(panN, "North");
        add(panC, "Center");
        addPan1();
        addPan2();
        addTable();
        initList("");
    }

    public void addPan1(){
        JLabel lblSearch = new JLabel("검색어 : ");
        pan2.add(lblSearch);
    }

    public void addPan2(){
        JLabel lblTitle = new JLabel("검색 프로그램");
        JButton btnSearch = new JButton("검색");
        btnSearch.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        pan1.add(lblTitle);
        pan2.add(tfSearch);
        pan2.add(btnSearch);
        initList("");
    }



    public void addTable(){
        tableModel = new DefaultTableModel(header, 15){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(tableModel);
        TableColumnModel columnModel=table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(70);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(180);
        columnModel.getColumn(3).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(200);
        columnModel.getColumn(5).setPreferredWidth(100);


        JScrollPane scrollPane = new JScrollPane(table);
        panC.add(scrollPane);
    }

    public void initList(String seacrhWord){
        OrderRepository orderRepository = new OrderRepository();
        ArrayList<OrderEntity> orderList = orderRepository.getOrderList(seacrhWord);
        tableModel.setRowCount(orderList.size());
        int i=0;
        for(OrderEntity orderEntity : orderList){
            tableModel.setValueAt(orderEntity.getOrderNum(),i,0);
            tableModel.setValueAt(orderEntity.getCustomerName(),i,1);
            tableModel.setValueAt(orderEntity.getProductName(),i,2);
            tableModel.setValueAt(orderEntity.getAmount(),i,3);
            tableModel.setValueAt(orderEntity.getDestination(),i,4);
            tableModel.setValueAt(orderEntity.getOrderDate(),i,5);
            i++;
        }
    }
}

