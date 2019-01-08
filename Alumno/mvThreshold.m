%
function [umbral, mu1, mu2] = MVThreshold(histo) 
% El algoritmo presupone que el histograma es Binodal
% Devuelve el umbral y la posición de los máximos de 
% los dos nodos principales.
SA = ACS(histo);
M = ACProm(histo);

umbral = fix(M(256)/SA(256));
last = 1;

  while (last != umbral)
    last = umbral;
    mu1 = M(umbral)/SA(umbral);
    mu2 = (M(256)-M(umbral))/(SA(256)-SA(umbral));
    umbral = fix((mu1 + mu2)/2);
  endwhile
  
endfunction


function sa= ACS(histo)
% Calcula la suma correlativa hasta del histograma
sa = zeros(1,256);
sa(1) = histo(1);

%[c] Suma acumulativa desde 2 a 256 de histo
for i=2:256 
    sa(i)=sa(i-1)+histo(i); 
endfor
end


function M = ACProm(histo) 
% 
M = zeros(1,256);M(1)=histo(1); 

%[c] Suma acumulativa de M: posicion anterior por valor de histo mas valor anterior de M (pista i=2:256)

  for i=2:256 
    M(i)=(i-1)*histo(i) + M(i-1); 
   endfor 
 
end 
