class Vecteur2D:
    _nombre_vecteurs_crees = 0

    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y
        Vecteur2D._nombre_vecteurs_crees += 1

    def get_x(self):
        return self.x

    def get_y(self):
        return self.y

    def get_nombre_vecteurs_crees(cls):
        return cls.nombre_vecteurs_crees
    get_nombre_vecteurs_crees = classmethod(get_nombre_vecteurs_crees)

    def display(self):
        return "X = {} - Y = {}".format(self.get_x(), self.get_y())

    def equals(self, autre):
        return self.get_x() == autre.get_x() and self.get_y() == autre.get_y()

    def norme(self):
        return (self.get_x()**2 + self.get_y()**2)**0.5


class Vecteur3D(Vecteur2D):
    def __init__(self, x=0, y=0, z=0):
        super(Vecteur3D, self).__init__(x, y)
        self.z = z

    def get_z(self):
        return self.z

    def display(self):
        return "{} - Z = {}".format(super(Vecteur3D, self).display(), self.get_z())

    def equals(self, other):
        return super(Vecteur3D, self).equals(other) and self.get_z() == other.get_z()

    def norme(self):
        return (self.get_x()**2 + self.get_y()**2 + self.get_z()**2)**0.5
    