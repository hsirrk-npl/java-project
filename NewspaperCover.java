import javax.swing.*;
import java.awt.*;

public class NewspaperCover extends JFrame {

    public NewspaperCover() {

        setTitle("Newspaper Cover Page");
        setSize(800, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new GridLayout(2, 1));

        JLabel title = new JLabel("THE DAILY NEWS", JLabel.CENTER);
        title.setFont(new Font("Times New Roman", Font.BOLD, 38));

        JLabel date = new JLabel("Monday Edition | June 2026", JLabel.CENTER);
        date.setFont(new Font("Arial", Font.PLAIN, 16));

        headerPanel.add(title);
        headerPanel.add(date);

        add(headerPanel, BorderLayout.NORTH);

        
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        JLabel headline = new JLabel("Technology is Changing the Future");
        headline.setFont(new Font("Arial", Font.BOLD, 24));
        headline.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel imageLabel = new JLabel("[ FRONT PAGE IMAGE ]");
        imageLabel.setFont(new Font("Arial", Font.ITALIC, 18));
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextArea newsText = new JTextArea();

        newsText.setText(
                "MAIN NEWS\n\n" +
                "Scientists and engineers are developing advanced technologies that are " +
                "transforming education, healthcare, transportation and communication. " +
                "Experts believe innovation will continue to improve daily life and create " +
                "new opportunities for future generations.\n\n" +

                "NATIONAL NEWS\n\n" +
                "The government has announced several infrastructure projects aimed at " +
                "improving roads, schools and healthcare facilities. Citizens have welcomed " +
                "these initiatives and expect positive economic growth in the coming years.\n\n" +

                "SPORTS NEWS\n\n" +
                "The national football team secured a thrilling victory in yesterday's match. " +
                "Fans celebrated across the country and praised the players for their teamwork " +
                "and determination.\n\n" +

                "TECHNOLOGY UPDATE\n\n" +
                "Artificial Intelligence, cloud computing and cybersecurity continue to be " +
                "major areas of growth. Businesses are investing heavily in digital solutions " +
                "to improve productivity and customer experience.\n\n" +

                "WEATHER REPORT\n\n" +
                "Meteorologists predict partly cloudy skies with moderate temperatures. " +
                "Residents are advised to stay updated with local weather forecasts before " +
                "making travel plans.\n\n" +

                "BUSINESS NEWS\n\n" +
                "Stock markets recorded steady growth this week as investors responded " +
                "positively to economic reports and company earnings announcements.\n\n" +

                "EDUCATION NEWS\n\n" +
                "Universities are introducing new programs focused on information technology, " +
                "data science and artificial intelligence to prepare students for modern careers.\n\n" +

                "ENTERTAINMENT\n\n" +
                "Several new movies and music albums are expected to be released this month. " +
                "Fans are eagerly waiting for announcements from their favorite artists.\n\n" +

                "ADVERTISEMENT\n\n" +
                "Visit our website for breaking news, exclusive interviews and daily updates. " +
                "Thank you for reading The Daily News."
        );

        newsText.setFont(new Font("Serif", Font.PLAIN, 17));
        newsText.setLineWrap(true);
        newsText.setWrapStyleWord(true);
        newsText.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(newsText);

        contentPanel.add(Box.createVerticalStrut(15));
        contentPanel.add(headline);
        contentPanel.add(Box.createVerticalStrut(15));
        contentPanel.add(imageLabel);
        contentPanel.add(Box.createVerticalStrut(15));
        contentPanel.add(scrollPane);

        add(contentPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new NewspaperCover();
    }
}
