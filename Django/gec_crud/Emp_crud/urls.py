from django.urls import path
from . import views

urlpatterns = [
    path("", views.home, name="home"),
    path("about/", views.about, name="about"),
    path("contact/", views.contact, name="contact"),
    path("edit/<int:id>/", views.edit_employee, name="edit_employee"),
    path("delete/<int:id>/", views.delete_employee, name="delete_employee"),
]

