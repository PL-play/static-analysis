package cmd;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;

public class CommandlineTest {


    /**
     * Help info
     *
     * @throws IOException
     */
    @Test
    public void test1() throws IOException {
        // java17
        String javaHome = System.getProperty("java.home");
        String javaBin = javaHome +
                File.separator + "bin" +
                File.separator + "java";
        String template = "{0} -jar {1} {2}";
        String cmd = MessageFormat.format(template, javaBin, "./target/ta.jar", "-h");
        System.out.println("cmd: " + cmd);
        Process p = Runtime.getRuntime().exec(cmd);
        BufferedReader in =
                new BufferedReader(new InputStreamReader(p.getInputStream()));
        String inputLine;
        System.out.println("result: ");
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }

    /**
     * -lr LISTRULE, --listrule LISTRULE
     * 'true' to list rules in current config.
     *
     * @throws IOException
     */
    @Test
    public void test2() throws IOException {
        // java17
        String javaHome = System.getProperty("java.home");
        String javaBin = javaHome +
                File.separator + "bin" +
                File.separator + "java";
        String template = "{0} -jar {1} {2}";
        String cmd = MessageFormat.format(template, javaBin, "./target/ta.jar", "-lr true");
        System.out.println("cmd: " + cmd);
        Process p = Runtime.getRuntime().exec(cmd);
        BufferedReader in =
                new BufferedReader(new InputStreamReader(p.getInputStream()));
        String inputLine;
        System.out.println("result: ");
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
        /**
         * rules in current config:
         *     name: 命令注入, ruleCwe: 78
         *     name: 路径操作, ruleCwe: 22
         *     name: sql注入, ruleCwe: 89
         */
    }


    @Test
    public void test3() throws IOException {
        // java17
        String javaHome = System.getProperty("java.home");
        String javaBin = javaHome +
                File.separator + "bin" +
                File.separator + "java";
        String template = "{0} -jar {1} {2}";

        String params = "-p " +
                // TODO replace with your project locations, split with white space.
                "/home/ran/Documents/work/thusa2/testprojects/WebGoat-5.0"
                + " " +
                "/home/ran/Documents/work/thusa2/testprojects/jsp-demo"
                + " " +
                // TODO replace with your jdk location.
                "-j /home/ran/Documents/work/thusa2/ifpc-testcase/jdk/rt.jar"
                // TODO track source file and calculate line number of jsp files.
                + " " +
                "-t true"
                + " " +
                // TODO write output
                "-w true"
                + " " +
                // TODO output file location
                "-o result.json"
                + " " +
                // TODO rules to be detected.
                "-r 78 22 89";

        /**
         * rules in current config:
         *     name: 命令注入, ruleCwe: 78
         *     name: 路径操作, ruleCwe: 22
         *     name: sql注入, ruleCwe: 89
         */

        String cmd = MessageFormat.format(template, javaBin, "./target/ta.jar", params);

        System.out.println("cmd: " + cmd);

        Process p = Runtime.getRuntime().exec(cmd);
        BufferedReader in =
                new BufferedReader(new InputStreamReader(p.getErrorStream()));
        String inputLine;
        System.out.println("result: ");
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }
}
