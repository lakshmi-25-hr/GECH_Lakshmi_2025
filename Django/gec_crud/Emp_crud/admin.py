from django.contrib import admin
from .models import Employee  # Import Employee model

@admin.register(Employee)
class EmployeeAdmin(admin.ModelAdmin):
    list_display = ["id", "name", "email", "department"]  # Columns displayed in admin panel
    search_fields = ["name", "email"]  # Enables search by name or email
    list_filter = ["department"]  # Adds filter for department
