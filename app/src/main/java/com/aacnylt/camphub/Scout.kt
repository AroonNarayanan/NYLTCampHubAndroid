package com.aacnylt.camphub

import java.util.*

class Scout {
    var FirstName: String = ""
    var LastName: String = ""

    var DateOfBirth: Date? = null
    var Gender: String? =null
    var ScoutID: Int = 0
    var BSAID: Int? = 0
    var Username: String? = null
    var Password: String? = null

    var Position: String? = null
    var Team: String? = null

    var IsAdmin: Boolean = false
    var IsYouth: Boolean = false
    var IsStaff: Boolean = false
    var IsElevated: Boolean = false

    var CourseName: String? = null
    var CourseID: Int = 0

    var LastModified: Date? = null
    var Created: Date? = null
}