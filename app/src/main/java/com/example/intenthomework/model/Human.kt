package com.example.intenthomework.model
import android.os.Parcel
import android.os.Parcelable


data class Human(var age: String?, var name: String?): Parcelable {

    constructor(source: Parcel): this(source.readString(), source.readString())

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(this.name)
        dest?.writeString(this.age)
    }

    companion object {
        @JvmField final val CREATOR: Parcelable.Creator<Human> = object : Parcelable.Creator<Human> {
            override fun createFromParcel(source: Parcel): Human{
                return Human(source)
            }

            override fun newArray(size: Int): Array<Human?> {
                return arrayOfNulls(size)
            }
        }
    }
}