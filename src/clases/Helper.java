/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;   

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SP
 */
public class Helper {

    public static void mensajeMatriz(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int numfilas, numcolumnas;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;

        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }

    public static void habilitarBotones(JButton[] botones) {

        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botones) {

        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }
    }

    public static void letraA(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;
        String aux2;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == numcolumnas - 1 || i == 0 || i == (numfilas - 1) / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraE(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == numfilas - 1 || j == 0 || i == (numfilas - 1) / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraF(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == 0 || i == (numfilas - 1) / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraI(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == (numfilas - 1) / 2 || i == 0 || i == numfilas - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraN(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == numfilas - 1 || i == j || j == 0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraP(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ((j == 0 || i == 0 || i == numfilas / 2) || (j == numcolumnas - 1 && j / i >= 2)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraT(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == (numcolumnas - 1) / 2 || i == 0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }

    }

    public static void letraV(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == i / 2 || j == numfilas - 1 - i / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }

    }

    public static void letraX(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (numfilas - 1 - i == j || i == j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraY(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == numcolumnas / 2 && j <= i || (i + j == numfilas - 1 && i <= j) || (i == j && i + j <= numfilas)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraZ(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || numfilas - 1 - i == j || i == numfilas - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void diagonalSecundaria(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (numfilas - 1 - i == j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void triangularSuperior(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int j = 1; j < numcolumnas; j++) {
            for (int i = 0; i < numfilas; i++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i <= j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }

    }

    public static void triangularInferior(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int j = 1; j < numcolumnas; j++) {
            for (int i = 0; i < numfilas; i++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i >= j || i == j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }

    }

    public static void transpuesta(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 1; i < numfilas; i++) {
            for (int j = 1; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                tabla2.setValueAt(aux, j, i);
            }
        }

    }

}
