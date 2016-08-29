package DSC;

import static DSC.DBClass.ref;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Aliens_Keanu
 */
public class MainScreen_Charts extends JPanel {

    private static int countStandard = 0;
    private static int countKiddies = 0;
    private static int countLowCarb = 0;
    
     private static int countStandard2 = 0;
    private static int countKiddies2 = 0;
    private static int countLowCarb2 = 0;

    public static void createBarGraph_Meals(JPanel pnlBarChart, boolean getData) {

        Firebase tableRef = ref.child("Orders");// Go to specific Table

        tableRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot ds) {
                if (getData) {
                    for (DataSnapshot Data : ds.getChildren()) {//entire database

                        boolean activeCheck = (boolean) Data.child("Active").getValue();

                        final String STANDARD = "Standard";
                        final String LOW_CARB = "Low Carb";
                        final String KIDDIES = "Kiddies";

                        for (DataSnapshot Data2 : Data.getChildren()) {

                            for (DataSnapshot Data3 : Data2.getChildren()) {

                                if (activeCheck == true && Data3.child("MealType").getValue().equals(STANDARD)) {

                                    countStandard++;

                                }

                                if (activeCheck == true && Data3.child("MealType").getValue().equals(LOW_CARB)) {

                                    countLowCarb++;

                                }

                                if (activeCheck == true && Data3.child("MealType").getValue().equals(KIDDIES)) {

                                    countKiddies++;

                                }

                            }

                        }

                    }
                }
                DefaultCategoryDataset dataset = new DefaultCategoryDataset();
                dataset.addValue(countLowCarb, "", "Low Carb");
                dataset.addValue(countStandard, "", "Standard");
                dataset.addValue(countKiddies, "", "Kiddies");

                JFreeChart barChart = ChartFactory.createBarChart(
                        "Comparison of Total Meals Between Weeks",
                        "Meal Types",
                        "Number Of Meals",
                        dataset,
                        PlotOrientation.VERTICAL,
                        false, true, false);

                ChartPanel chartPanel = new ChartPanel(barChart);
                chartPanel.setBounds(0, 0, pnlBarChart.getWidth(), pnlBarChart.getHeight());
                pnlBarChart.add(chartPanel, BorderLayout.CENTER);
                chartPanel.setSize(new Dimension(pnlBarChart.getWidth(), pnlBarChart.getHeight()));
                chartPanel.repaint();

            }

            @Override
            public void onCancelled(FirebaseError fe) {
                JOptionPane.showMessageDialog(null, "ERROR: " + fe);
            }
        });

    }

    public static void createBarGraphCompare_Meals(JPanel pnlBarChart, boolean getData) {

        Firebase tableRef = ref.child("Orders");// Go to specific Table

        tableRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot ds) {
                if (getData) {
                    for (DataSnapshot Data : ds.getChildren()) {//entire database

                        boolean activeCheck = (boolean) Data.child("Active").getValue();

                        final String STANDARD = "Standard";
                        final String LOW_CARB = "Low Carb";
                        final String KIDDIES = "Kiddies";

                        for (DataSnapshot Data2 : Data.getChildren()) {

                            for (DataSnapshot Data3 : Data2.getChildren()) {

                                if (activeCheck == false && Data3.child("MealType").getValue().equals(STANDARD)) {

                                    countStandard2++;

                                }

                                if (activeCheck == false && Data3.child("MealType").getValue().equals(LOW_CARB)) {

                                    countLowCarb2++;

                                }

                                if (activeCheck == false && Data3.child("MealType").getValue().equals(KIDDIES)) {

                                    countKiddies2++;

                                }

                            }

                        }

                    }
                }
                
                DefaultCategoryDataset dataset = new DefaultCategoryDataset();
                dataset.addValue(countLowCarb2, "", "Low Carb");
                dataset.addValue(countStandard2, "", "Standard");
                dataset.addValue(countKiddies2, "", "Kiddies");

                JFreeChart barChart = ChartFactory.createBarChart(
                        "Comparison of Total Meals Between Weeks",
                        "Meal Types",
                        "Number Of Meals",
                        dataset,
                        PlotOrientation.VERTICAL,
                        false, true, false);

                ChartPanel chartPanel = new ChartPanel(barChart);
                chartPanel.setBounds(0, 0, pnlBarChart.getWidth(), pnlBarChart.getHeight());
                pnlBarChart.add(chartPanel, BorderLayout.CENTER);
                chartPanel.setSize(new Dimension(pnlBarChart.getWidth(), pnlBarChart.getHeight()));
                chartPanel.repaint();

            }

            @Override
            public void onCancelled(FirebaseError fe) {
                JOptionPane.showMessageDialog(null, "ERROR: " + fe);
            }
        });

    }

}
