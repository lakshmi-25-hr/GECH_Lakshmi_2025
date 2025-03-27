from django.shortcuts import render, redirect
from . import models
from . import forms

# Home Page - Add and Display Employees
def home(request):
    if request.method == "POST":
        emp_form = forms.EmployeeForm(request.POST)
        if emp_form.is_valid():
            emp_form.save()
            emp_form = forms.EmployeeForm()  # Clear the form after submission
    else:
        emp_form = forms.EmployeeForm()

    employees = models.Employee.objects.all()
    context = {"employees": employees, "emp_form": emp_form}
    return render(request, "home.html", context)

# About Page
def about(request):
    return render(request, "about.html")

# Contact Page
def contact(request):
    return render(request, "contact.html")

# Edit Employee
def edit_employee(request, id):
    employee = models.Employee.objects.get(id=id)
    if request.method == "POST":
        emp_form = forms.EmployeeForm(request.POST, instance=employee)
        if emp_form.is_valid():
            emp_form.save()
            return redirect("home")
    else:
        emp_form = forms.EmployeeForm(instance=employee)

    context = {"emp_form": emp_form}
    return render(request, "edit.html", context)

# Delete Employee
def delete_employee(request, id):
    employee = models.Employee.objects.get(id=id)
    if employee:
        employee.delete()
    return redirect("home")
