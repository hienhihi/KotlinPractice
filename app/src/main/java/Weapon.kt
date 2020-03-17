class Weapon(val name: String, var damageInflicted: Int) {
    override fun toString(): String = "$name inflict $damageInflicted"
}