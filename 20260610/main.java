import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

// import java.net.PasswordAuthentication;
// import jakarta.mail.Authenticator;
// import jakarta.mail.Session;

public class Main {
    public static void main(String[] args) {
        // =========================
        // ロリポップの設定情報
        // =========================
        final String username = "test@daddyk.babyblue.jp";
            final String password = "Sorpyitkg2003";
            final String smtpServer = "smtp.lolipop.jp (ポート番号: 465)";
            final String smtpPort = "465";
        
        // =========================
        // メールの内容情報
        // =========================
        final String toEmail = "yagi@i-seifu.jp";       // 送信先のメールアドレス
        final String fromEmail = "tomogane@i-seifu.jp"; // 送信元のメールアドレス
        final String fromName = "友金牧人";              // 送信者名
        final String subject = "■ 6/10(木)開催の企業説明会について"; // 件名
        final String body = """
            お疲れ様です。
            友金です。

            6月10日(木)に企業説明会を開催します。
            参加希望の方は、以下のURLから申し込みお願いいたします。
            https://example.com/registration

            以上、よろしくお願いいたします。
        
        """; // 本文

        // =========================
        // メール送信
        // =========================
        // メール送信の準備
        Properties props = new Properties();
        props.put("mail.smtp.host", smtpServer);    // SMTPサーバーの設定
        props.put("mail.smtp.port", smtpPort);      // SMTPサーバーのポート設定
        props.put("mail.smtp.auth", "true"); // ログインしますか？設定(true=>はい)
        props.put("mail.smtp.ssl.enable", "true");  // セキュアにします？設定(true=>はい)
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        // 認証の設定をしている
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        // メール送信
        try {
            // メールを作っている
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail, fromName, "UTF-8"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(subject);
            message.setText(body);

            // メール送信実行！！
            Transport.send(message);
            System.out.println("メール送信成功！！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}