# 事前に実行しておくSQL
# CREATE DATABASE algolearn character set 'utf8';
# GRANT ALL PRIVILEGES ON algolearn.* TO 'algolearnadmin'@'localhost' IDENTIFIED BY 'algolearnpass';

DROP TABLE IF EXISTS t_task;

CREATE TABLE t_task(id char(6),title varchar(100), primary key(id)) character set 'utf8';

# DROP TABLE IF EXISTS t_prglanguage;
# CREATE TABLE t_prglanguage(name varchar(20), build_cmd_ath varchar(200), execute_cmd_path varchar(200), work_folder_path varchar(200), primary key(name)) character set 'utf8';
# INSERT t_task VALUES("999999", "test-insert1");