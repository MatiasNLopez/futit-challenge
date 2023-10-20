import { useState, useEffect } from 'react';

export const useCounter = (valueInitial = 0) => {
    const [counter, setcounter] = useState(valueInitial);
    
    const reset = () => setcounter(valueInitial)
    const increase = num => setcounter(counter + num);
    const subtract = num => setcounter(counter - num);

    return {reset, increase ,subtract}
}
