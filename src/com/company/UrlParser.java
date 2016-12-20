package com.company;

/**
 * Created by Simona Simeonova on 19-Dec-16.
 */
import java.util.Scanner;

public class UrlParser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int protocolIndex = input.indexOf("://");
        String protocol = "";
        if (protocolIndex>0)
        {
            protocol = input.substring(0, protocolIndex);
        }
        int resourceIndex = input.indexOf("/", protocolIndex + 3);
        String server = "";
        String resource = "";
        if (resourceIndex > 0)
        {
            server = input.substring(protocolIndex + 3, resourceIndex);
            resource = input.substring(resourceIndex + 1);
        }
        else if (protocolIndex>0)
        {
            server = input.substring(protocolIndex + 3);
        }
        else
        {
            server = input.substring(protocolIndex + 1);
        }

        System.out.println("[protocol] = \"" + protocol + "\"");
        System.out.println("[server] = \"" + server + "\"" );
        System.out.println("[resource] = \"" + resource + "\"");
    }
}