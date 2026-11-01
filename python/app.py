import requests
import jwt
import urllib3
from werkzeug import secure_filename
from jinja2 import Environment


def download(url):
    return requests.get(url, timeout=5).text


def read_claims(token, key):
    return jwt.decode(token, key)


def save_name(name):
    return secure_filename(name)


def fetch_status(url):
    return urllib3.PoolManager().request("GET", url).status


def render(name):
    return Environment(autoescape=True).from_string("Hello {{ name }}").render(name=name)
