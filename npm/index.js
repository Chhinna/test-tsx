const _ = require("lodash");
const axios = require("axios");
const express = require("express");
const fetch = require("node-fetch");

exports.names = (rows) => _.map(rows, "name");
exports.download = (url) => axios.get(url, { timeout: 5000 });
exports.createApp = () => express.createServer();
exports.fetchJson = (url) => fetch(url).then((response) => response.json());
// minimist is intentionally declared but unused.
