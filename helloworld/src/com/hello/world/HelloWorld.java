/**
 * HelloWorld.java
 * Created: Feb 7, 2013
 * (c) Copyright 2013 Cloud Cruiser Inc.
 * All Rights Reserved
 */
package com.hello.world;

import java.util.Date;

/**
 * @author Jorn
 *
 */
public class HelloWorld
{
  String myshizzle;

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    // why?

    System.out.println("Hello World: " + new Date().toLocaleString());
    // why is this not working???
    for(int i = 0; i < 10; i++)
    {
      System.out.println("Hello again!!!");
    }

    // and another change by myself...
  }
}
