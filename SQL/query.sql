/*  */

/* 1 Name of window with AD_Window_ID = ‘100’ */
SELECT Name From AD_Window_ID = '100'

/* 2 Update window with AD_Window_ID = ‘100’ appending ‘--’ to the name of
window with AD_Window_ID = ‘100’ */
UPDATE AD_Window SET Name = Name + "--" WHERE AD_Window_ID = '100'

/* 3 List of all tabs in window with AD_Window_ID = ‘100’ */
SELECT AD_TAB.AD_TAB_ID, AD_TAB.nombre
FROM AD_TAB
INNER JOIN AD_WINDOW ON AD_TAB.AD_WINDOW_ID = AD_WINDOW.AD_WINDOW_ID
WHERE AD_WINDOW.AD_WINDOW_ID = 100;

/* 5 Name and number of tabs of all windows */
SELECT w.nombre AS Window_Name, COUNT(t.AD_TAB_ID) AS Number_of_Tabs
FROM AD_WINDOW w
LEFT JOIN AD_TAB t ON w.AD_WINDOW_ID = t.AD_WINDOW_ID
GROUP BY w.AD_WINDOW_ID, w.nombre
ORDER BY w.AD_WINDOW_ID;

/* 7 Windows with more than 5 tabs */
SELECT w.nombre AS Window_Name, COUNT(t.AD_TAB_ID) AS Number_of_Tabs
FROM AD_WINDOW w
LEFT JOIN AD_TAB t ON w.AD_WINDOW_ID = t.AD_WINDOW_ID
GROUP BY w.AD_WINDOW_ID, w.nombre
HAVING COUNT(t.AD_TAB_ID) > 5;

