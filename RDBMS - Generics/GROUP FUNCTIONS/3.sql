alter session set current_schema=bank;
SET heading OFF;

SELECT CUST_ID, COUNT(CUST_ID)
FROM BANK_CUST_CONTACT
WHERE CONTACT_TYPE LIKE 'OFF%'
GROUP BY CUST_ID
HAVING COUNT(CUST_PHONE) >1;
