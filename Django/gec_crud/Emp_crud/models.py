from django.db import models

class Employee(models.Model):
    name = models.CharField(max_length=200, blank=False)
    email = models.EmailField(unique=True, blank=False)
    department = models.CharField(max_length=100, blank=False)
    position = models.CharField(max_length=100, blank=False)
    salary = models.DecimalField(max_digits=10, decimal_places=2, blank=False)

    def __str__(self):
        return self.name  # Shows employee name in admin panel
