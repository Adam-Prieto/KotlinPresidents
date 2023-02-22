//****************************************************************************

package com.example.javapresidents;

import androidx.annotation.NonNull;
import java.util.Comparator;

public class President
{
    private int id;
    private String name;
    private int dateAssumedOffice;
    private String imageURL;

    //************************************************************************

    /**@methodName: President (constructor)
     * @param: id (president id)
     * @param: name (president name)
     * @param: dateAssumedOffice (year the president came into office)
     * @param: imageURL (link to president's picture)
     * @return: null
     * @description: Basic constructor for President class
     * */
    public President(int id, String name, int dateAssumedOffice,
                     String imageURL)
    {
        this.id = id;
        this.name = name;
        this.dateAssumedOffice = dateAssumedOffice;
        this.imageURL = imageURL;
    } // End constructor

    //************************************************************************

    /**@methodName: PresidentNameAZComparator
     * @return: Comparator based on two president names.
     * @description: This comparator "sorts" presidents into ascending order
     * based on who comes first alphabetically.
     * */

    public static Comparator<President> PresidentNameAZComparator =
            new Comparator<President>()
            {
                @Override
                public int compare(President p1, President p2)
                {
                    return p1.getName().compareTo(p2.getName());
                } // End compare
            }; // End PresidentNameAZComparator

    //************************************************************************

    /**@methodName: PresidentNameZAComparator
     * @return: Comparator based on two president names.
     * @description: This comparator "sorts" presidents into ascending order
     * based on who comes second alphabetically.
     * */

    public static Comparator<President> PresidentNameZAComparator =
            new Comparator<President>()
            {
                @Override
                public int compare(President p1, President p2)
                {
                    return p2.getName().compareTo(p1.getName());
                } // End compare
            }; // End PresidentNameZAComparator

    //************************************************************************
    /**@methodName: PresidentDateAscendingComparator
     * @return: Comparator based on when two presidents assumed office
     * (earliest first).
     * @description: Sort presidents based on who assumed office first.
     * */
    public static Comparator<President> PresidentDateAscendingComparator =
            new Comparator<President>()
            {
                @Override
                public int compare(President p1, President p2)
                {
                    return p1.getDateAssumedOffice() -
                           p2.getDateAssumedOffice();
                } // End compare
            }; // End PresidentDateAscendingComparator

    //************************************************************************
    /**@methodName: PresidentDateDescendingComparator
     * @return: Comparator based on when two presidents assumed office (latest
     * first).
     * @description: Sort presidents based on who assumed office second.
     * */
    public static Comparator<President> PresidentDateDescendingComparator =
            new Comparator<President>()
            {
                @Override
                public int compare(President p1, President p2)
                {
                    return p2.getDateAssumedOffice() -
                           p1.getDateAssumedOffice();
                } // End compare
            }; // End PresidentDateDescendingComparator

    //************************************************************************
    /**@methodName: toString
     * @return: String of president information
     * @description: Basic toString method for president information.
     * */
    @NonNull
    @Override
    public String toString()
    {
        return "President{" + "id=" + id + ", name='" + name + '\'' +
               ", dateAssumedOffice=" + dateAssumedOffice + ", imageURL='" +
               imageURL + '\'' + '}';
    } // End toString

    //************************************************************************
    /**@methodName: getId
     * @return: id (int)
     * @description: Getter for president's id.
     * */
    public int getId()
    {
        return id;
    } // End getId

    //************************************************************************
    /**@methodName: setID
     * @param:  id (int)
     * @description: Setter for president's id.
     * */
    public void setId(int id)
    {
        this.id = id;
    } // End setID


    //************************************************************************
    /**@methodName: getName
     * @return: name (String)
     * @description: Getter for president's id.
     * */
    public String getName()
    {
        return name;
    } // End getName

    //************************************************************************
    /**@methodName: setName
     * @param: name (String)
     * @description: Setter for president's name.
     * */
    public void setName(String name)
    {
        this.name = name;
    } // End setName

    //************************************************************************
    /**@methodName: getDateAssumedOffice
     * @return: dateAssumedOffice (int)
     * @description: Getter for president's inauguration.
     * */
    public int getDateAssumedOffice()
    {
        return dateAssumedOffice;
    } // End getDateAssumedOffice

    //************************************************************************
    /**@methodName: setDateAssumedOffice
     * @param: dateAssumedOffice (int)
     * @return: void
     * @description: Setter for president's assumption of office.
     * */
    public void setDateAssumedOffice(int dateAssumedOffice)
    {
        this.dateAssumedOffice = dateAssumedOffice;
    } // End setDateAssumedOffice

    //************************************************************************
    /**@methodName:
     * @param:
     * @return:
     * @description:
     * */
    public String getImageURL()
    {
        return imageURL;
    } // End getImageURL

    //************************************************************************
    /**@methodName:
     * @param:
     * @return:
     * @description:
     * */
    public void setImageURL(String imageURL)
    {
        this.imageURL = imageURL;
    } // End setImageURL
} // End President class
