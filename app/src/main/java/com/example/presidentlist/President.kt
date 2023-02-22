package com.example.presidentlist


class President(var id: Int, var name: String, dateAssumedOffice: Int,
                imageURL: String)
{
    
    var dateAssumedOffice: Int
    var imageURL: String
    var presName: String
    
    init
    {
        this.dateAssumedOffice = dateAssumedOffice
        this.imageURL = imageURL
        this.presName = name
    } // End constructor
    
    override fun toString(): String
    {
        return "President{id=$id, name='$name', dateAssumedOffice=$dateAssumedOffice, imageURL='$imageURL'}"
    } // End toString
    
    companion object
    {
        var PresidentNameAZComparator =
            java.util.Comparator<President> { p1, p2 ->
                p1.name.compareTo(p2.name)
            }
        
        var PresidentNameZAComparator =
            java.util.Comparator<President> { p1, p2 ->
                p2.name.compareTo(p1.name)
            } // End compare
        
        var PresidentDateAscendingComparator =
            java.util.Comparator<President> { p1, p2 -> p1.dateAssumedOffice - p2.dateAssumedOffice } // End compare
        
        var PresidentDateDescendingComparator =
            java.util.Comparator<President> { p1, p2 -> p2.dateAssumedOffice - p1.dateAssumedOffice } // End compare
        // End PresidentDateDescendingComparator
    }
} // End President class
