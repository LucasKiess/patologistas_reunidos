-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 21-Nov-2019 às 20:50
-- Versão do servidor: 10.4.6-MariaDB
-- versão do PHP: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `labreunidos`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `caixaemprestimo`
--

CREATE TABLE `caixaemprestimo` (
  `codEmprestimo` int(11) NOT NULL,
  `nomePessoa` varchar(30) NOT NULL,
  `valorEmprestimo` decimal(6,2) NOT NULL,
  `dataEmprestimo` date NOT NULL,
  `situacao` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `caixaemprestimo`
--

INSERT INTO `caixaemprestimo` (`codEmprestimo`, `nomePessoa`, `valorEmprestimo`, `dataEmprestimo`, `situacao`) VALUES
(4, 'Lucas', '16.10', '2019-11-07', 'Pendente'),
(5, 'Sandro', '400.00', '2019-11-12', 'Pendente');

-- --------------------------------------------------------

--
-- Estrutura da tabela `caixaentrada`
--

CREATE TABLE `caixaentrada` (
  `codCaixaEntrada` int(11) NOT NULL,
  `descricaoCaixaEntrada` varchar(50) NOT NULL,
  `valorCaixaEntrada` decimal(6,2) NOT NULL,
  `dataCaixaEntrada` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `caixaentrada`
--

INSERT INTO `caixaentrada` (`codCaixaEntrada`, `descricaoCaixaEntrada`, `valorCaixaEntrada`, `dataCaixaEntrada`) VALUES
(32, 'C25544', '60.00', '2019-10-01'),
(33, 'C25546', '4.30', '2019-10-02'),
(34, 'C25547', '8.60', '2019-10-02'),
(35, 'C25548', '4.30', '2019-10-03'),
(36, 'C25549', '8.60', '2019-10-03'),
(37, 'C25550', '8.60', '2019-10-04'),
(38, 'C25551', '8.60', '2019-10-04'),
(39, 'C25552', '30.00', '2019-10-04'),
(40, 'C25553', '60.00', '2019-10-04'),
(41, 'C25554', '30.00', '2019-10-04'),
(42, 'C25555', '30.00', '2019-10-04'),
(43, 'C25556', '30.00', '2019-10-04'),
(44, 'C25558', '8.60', '2019-10-09'),
(45, 'C25562', '8.60', '2019-10-09'),
(46, 'C25563', '8.60', '2019-10-09'),
(47, 'C25566', '6.45', '2019-10-10'),
(48, 'C25567', '6.45', '2019-10-10'),
(49, 'C25557', '8.60', '2019-10-07'),
(50, 'C25569', '4.30', '2019-10-10'),
(51, 'C25570', '8.60', '2019-10-10'),
(52, 'C25571', '6.45', '2019-10-10'),
(53, 'C25572', '60.00', '2019-10-10'),
(54, 'C25573', '2.15', '2019-10-10'),
(55, 'C25574', '6.45', '2019-10-10'),
(56, 'C25575', '4.30', '2019-10-10'),
(57, 'C25576', '8.60', '2019-10-10'),
(58, 'C25577', '6.45', '2019-10-10'),
(59, 'C25579', '30.00', '2019-10-11'),
(60, 'C25580', '30.00', '2019-10-11'),
(61, 'C25581', '60.00', '2019-10-11'),
(62, 'C25582', '30.00', '2019-10-11'),
(63, 'C25583', '30.00', '2019-10-11'),
(64, 'C25584', '30.00', '2019-10-11'),
(65, 'C25585', '30.00', '2019-10-11'),
(66, 'C25586', '8.60', '2019-10-11'),
(67, 'C25587', '60.00', '2019-10-11'),
(68, 'C25588', '4.30', '2019-10-11'),
(69, 'C25589', '30.00', '2019-10-11'),
(70, 'C25590', '30.00', '2019-10-11'),
(71, 'C25593', '8.60', '2019-10-15'),
(72, 'C25600', '6.45', '2019-10-17'),
(73, 'C25602', '6.45', '2019-10-17'),
(74, 'C25603', '60.00', '2019-10-17'),
(75, 'C25604', '60.00', '2019-10-17'),
(76, 'C25605', '60.00', '2019-10-17'),
(77, 'C25606', '4.30', '2019-10-17'),
(78, 'C25608', '6.45', '2019-10-17'),
(79, 'C25609', '8.60', '2019-10-17'),
(80, 'C25610', '30.00', '2019-10-18'),
(81, 'C25611', '60.00', '2019-10-18'),
(82, 'C25612', '30.00', '2019-10-18'),
(83, 'C25613', '30.00', '2019-10-18'),
(84, 'C25614', '30.00', '2019-10-18'),
(85, 'C25615', '30.00', '2019-10-18'),
(86, 'C25616', '8.60', '2019-10-18'),
(87, 'C25617', '8.60', '2019-10-18'),
(88, 'C25618', '8.60', '2019-10-18'),
(89, 'C25607', '6.45', '2019-10-18'),
(90, 'C25621', '4.30', '2019-10-21'),
(91, 'C25622', '8.60', '2019-10-21'),
(92, 'C25625', '60.00', '2019-10-22'),
(93, 'C25628', '8.60', '2019-10-24'),
(94, 'C25630', '8.60', '2019-10-25'),
(95, 'C25631', '8.60', '2019-10-25'),
(96, 'C25632', '8.60', '2019-10-25'),
(97, 'C25633', '4.30', '2019-10-25'),
(98, 'C25634', '30.00', '2019-10-25'),
(99, 'C25635', '30.00', '2019-10-25'),
(100, 'C25636', '30.00', '2019-10-25'),
(101, 'C25637', '8.60', '2019-10-28'),
(102, 'C25639', '8.60', '2019-10-30'),
(103, 'C25642', '4.30', '2019-10-31'),
(104, 'C25643', '4.30', '2019-10-31'),
(105, 'C25644', '8.60', '2019-10-31'),
(106, 'C25568', '4.30', '2019-10-10'),
(107, 'C25645', '2.15', '2019-11-01'),
(108, 'C25646', '6.45', '2019-11-01'),
(109, 'C25647', '8.60', '2019-11-01'),
(110, 'C25648', '6.45', '2019-11-01'),
(111, 'C25651', '4.30', '2019-11-04'),
(112, 'C25652', '2.15', '2019-11-04'),
(113, 'C25653', '8.60', '2019-11-04'),
(114, 'C25654', '60.00', '2019-11-04'),
(115, 'C415730', '100.00', '2019-11-05'),
(116, 'C25656', '8.60', '2019-11-06'),
(117, 'C25657', '8.60', '2019-11-06'),
(118, 'C25658', '60.00', '2019-11-06'),
(119, 'C25659', '60.00', '2019-11-06'),
(120, 'C25662', '4.30', '2019-11-07'),
(121, 'C25663', '8.60', '2019-11-07'),
(122, 'C25665', '2.15', '2019-11-07'),
(123, 'C25666', '8.60', '2019-11-07'),
(124, 'C25667', '2.15', '2019-11-07'),
(125, 'C25668', '2.15', '2019-11-07'),
(126, 'C25669', '60.00', '2019-11-07'),
(127, 'C25670', '4.30', '2019-11-07'),
(128, 'C25671', '6.45', '2019-11-07'),
(129, 'C25672', '4.30', '2019-11-07'),
(131, 'C25673', '30.00', '2019-11-08'),
(132, 'C25674', '30.00', '2019-11-08'),
(133, 'C25675', '30.00', '2019-11-08'),
(134, 'C25676', '30.00', '2019-11-08'),
(135, 'C25677', '30.00', '2019-11-08'),
(136, 'C25678', '30.00', '2019-11-08'),
(137, 'C25679', '30.00', '2019-11-08'),
(138, 'C25680', '30.00', '2019-11-08'),
(139, 'C25682', '8.60', '2019-11-12'),
(140, 'C25683', '2.15', '2019-11-12'),
(141, 'C25686', '8.60', '2019-11-12'),
(142, 'C25687', '8.60', '2019-11-13'),
(143, 'C25688', '8.60', '2019-11-13'),
(144, 'C25689', '2.15', '2019-11-18'),
(145, 'C25690', '8.60', '2019-11-18'),
(146, 'C25691', '60.00', '2019-11-18');

-- --------------------------------------------------------

--
-- Estrutura da tabela `caixasaida`
--

CREATE TABLE `caixasaida` (
  `codCaixaSaida` int(11) NOT NULL,
  `descricaoCaixaSaida` varchar(50) NOT NULL,
  `valorCaixaSaida` decimal(6,2) NOT NULL,
  `dataCaixaSaida` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `caixasaida`
--

INSERT INTO `caixasaida` (`codCaixaSaida`, `descricaoCaixaSaida`, `valorCaixaSaida`, `dataCaixaSaida`) VALUES
(8, 'Copo descartável', '5.69', '2019-10-01'),
(9, 'Passagem Thales', '14.00', '2019-10-02'),
(10, 'Gasolina Lucas', '20.00', '2019-10-03'),
(11, 'Papel higiênico', '9.90', '2019-10-04'),
(12, 'Passagem Thales', '14.00', '2019-10-04'),
(13, 'Passagem Thales', '14.00', '2019-10-08'),
(14, 'Sabonete', '4.89', '2019-10-09'),
(15, 'Elástico', '5.25', '2019-10-09'),
(16, 'Passagem Thales', '14.00', '2019-10-11'),
(17, 'Água', '12.00', '2019-10-14'),
(18, 'Passagem Thales', '14.00', '2019-10-14'),
(19, 'Passagem Thales', '14.00', '2019-10-16'),
(20, 'Calculadora, post it', '43.40', '2019-10-18'),
(21, 'Passagem Thales', '14.00', '2019-10-18'),
(22, 'Recarga cartucho', '25.00', '2019-10-22'),
(23, 'Passagem Thales', '14.00', '2019-10-24'),
(24, 'Recibo', '6.50', '2019-10-25'),
(25, 'Passagem Thales', '14.00', '2019-10-25'),
(26, 'CEEE', '69.75', '2019-10-28'),
(27, 'Passagem Thales', '14.00', '2019-10-29'),
(28, 'Vale-transporte Thales', '192.00', '2019-10-31'),
(29, 'Passagem Thales', '14.00', '2019-10-31'),
(30, 'Diferença aluguel', '12.00', '2019-10-31'),
(31, 'Passagem Thales', '14.00', '2019-11-01'),
(32, 'Passagem Thales', '14.00', '2019-11-04'),
(33, 'Passagem Thales', '14.00', '2019-11-06'),
(35, 'Passagem Thales', '14.00', '2019-11-08'),
(36, 'Passagem Thales', '14.00', '2019-11-11'),
(37, 'Passagem Thales', '14.00', '2019-11-13'),
(38, 'Passagem Thales', '14.00', '2019-11-18'),
(39, 'Extensão de Luz', '10.90', '2019-11-19'),
(40, 'Folha A4', '5.90', '2019-11-19'),
(41, 'Copo descartável', '3.59', '2019-11-19'),
(42, 'Cartucho Canon 145 (Novo)', '129.00', '2019-11-19'),
(43, 'Passagem Thales', '14.00', '2019-11-20'),
(44, 'Passagem Thales', '14.00', '2019-11-22');

-- --------------------------------------------------------

--
-- Estrutura da tabela `entradamaterial`
--

CREATE TABLE `entradamaterial` (
  `codEntrada` int(11) NOT NULL,
  `descricaoMaterialE` varchar(30) NOT NULL,
  `quantidadeEntrada` int(2) NOT NULL,
  `dataEntrada` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `entradamaterial`
--

INSERT INTO `entradamaterial` (`codEntrada`, `descricaoMaterialE`, `quantidadeEntrada`, `dataEntrada`) VALUES
(27, 'Frasco Pequeno', 1, '2019-11-08'),
(28, 'Frasco Médio', 10, '2019-11-08'),
(29, 'Frasco Grande', 2, '2019-11-08'),
(30, 'Frasco Médio', 2, '2019-11-08'),
(31, 'Envelope CP', 10, '2019-11-08'),
(32, 'Lâmina', 10, '2019-11-08'),
(33, 'Requisição CP', 10, '2019-11-08');

-- --------------------------------------------------------

--
-- Estrutura da tabela `estoquematerial`
--

CREATE TABLE `estoquematerial` (
  `codMaterial` int(11) NOT NULL,
  `descricaoMaterial` varchar(30) NOT NULL,
  `quantidadeMaterial` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `estoquematerial`
--

INSERT INTO `estoquematerial` (`codMaterial`, `descricaoMaterial`, `quantidadeMaterial`) VALUES
(1, 'Frasco Pequeno', 0),
(2, 'Frasco Médio', 0),
(3, 'Frasco Grande', 0),
(4, 'Formol', 0),
(5, 'Envelope CP', 0),
(6, 'Lâmina', 0),
(7, 'Requisição CP', 0),
(8, 'Fixador', 0),
(9, 'Escova Cervical', 0),
(10, 'Espátula de Ayre', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `listatelefone`
--

CREATE TABLE `listatelefone` (
  `codTelefone` int(11) NOT NULL,
  `nome` varchar(80) NOT NULL,
  `celular` varchar(20) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `observacao` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `listatelefone`
--

INSERT INTO `listatelefone` (`codTelefone`, `nome`, `celular`, `telefone`, `observacao`) VALUES
(14, 'Patologistas Reunidos', '(51) 99529-0925', '(51) 3023-2479', 'Matriz POA'),
(15, 'Patologistas Reunidos', '', '(51) 3054-2638', 'Filial Viamão'),
(16, 'Consultório Lúcia Zimmer/Karen Derungs', '', '(51) 3485-3187', 'Recepcionista Flávia'),
(17, 'Consultório Eduardo Dias Lopes', '', '(51) 3485-1383', 'Recepcionista Ana'),
(18, 'Clínica Higia', '', '(51) 3045-2020', 'Recepcionista Márcia'),
(19, 'Clínica Vieira', '', '(51) 3485-1284', 'Recepcionista Rita'),
(20, 'Clínica Guyas', '', '(51) 3054-1300', 'Responsável: Carlos ou Rejane'),
(21, 'Hospital de Viamão', '', '(51) 3485-4700', 'Telefone geral'),
(22, 'Clínica Axxis', '', '(51) 3485-1400', 'Responsável: Dr Leonardo Espinosa'),
(23, 'Dr. Adelon Amaral', '(51) 99596-0707', '', ''),
(24, 'Dr. Ademar S. Junior', '(51) 99140-7751', '', ''),
(25, 'Dra. Claudia Silva Porta', '(51) 99304-9828', '', ''),
(26, 'Dra. Carmen Veronese', '(51) 99981-7939', '', ''),
(27, 'Dra. Constança', '(51) 99964-6489', '', ''),
(28, 'Dra. Cândida Spengler', '(51) 99920-9937', '', ''),
(29, 'Dr. Eduardo Dias Lopes', '(51) 99191-6548', '', ''),
(30, 'Dr. Flávio Vieira', '(51) 99655-7901', '', ''),
(31, 'Dr. Félix Ojeda', '(51) 99790-9222', '', ''),
(32, 'IPERGS', '', '(51) 3299-2080', ''),
(33, 'Dr. Leonardo Espinosa', '(51) 99986-9767', '', ''),
(34, 'Dr. João Almir C. Jorge', '(51) 99114-5955', '', ''),
(35, 'Dra. Lúcia Zimmer', '(51) 99981-5910', '', ''),
(36, 'Dr. Luiz Fernando Vieira', '(51) 99982-5360', '', ''),
(37, 'Bê Express', '', '(51) 3485-2356', 'Motoboy'),
(38, 'Motoboy Robson Gi', '', '(51) 3446-6140', ''),
(39, 'Dr. Mauricio Krug Seabra', '(51) 99997-2381', '', ''),
(40, 'Dr. Marcos Maraskin Fonseca', '(51) 99113-3907', '', ''),
(41, 'Dr. Oberdan Leonhardt', '(51) 99982-5042', '', ''),
(42, 'Dra. Paula M.C. Vieira', '(51) 99972-0169', '(51) 3320-3000', ''),
(43, 'Dra. Rejane Berger', '(51) 99102-8595', '', ''),
(44, 'Dr. Ricardo Agustini', '(51) 99350-5151', '', ''),
(45, 'Sidi Medicina por Imagem', '', '(51) 3485-8052', ''),
(46, 'Dr. Maximiliano Correa Deves', '(55) 99907-5986', '', ''),
(47, 'Lucas Kiess', '(51) 98609-9381', '', 'Auxiliar Administrativo - Viamão'),
(48, 'Conta Bancária - Banco do Brasil', '(00) 00000-0000', '', 'Ag: 5745-2 CC: 29537-x ou 0');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pagamentocartao`
--

CREATE TABLE `pagamentocartao` (
  `codPagamento` int(11) NOT NULL,
  `exame` varchar(8) NOT NULL,
  `paciente` varchar(100) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `endereco` varchar(120) NOT NULL,
  `cep` varchar(9) NOT NULL,
  `valor` decimal(8,2) NOT NULL,
  `data` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `pagamentocartao`
--

INSERT INTO `pagamentocartao` (`codPagamento`, `exame`, `paciente`, `cpf`, `endereco`, `cep`, `valor`, `data`) VALUES
(1, 'A20565', 'Lucia Burca', '583.876.170-91', 'Rua Inspetor Saul Trindade, 74 - São Lucas - Viamão', '94450-36', '60.00', '2019-11-21'),
(2, 'A56222', 'Lucas Kiess', '045.531.450-06', 'Rua Pedro Palermo, 308 - Santo Onofre - Viamão', '94445-057', '120.00', '2019-11-21'),
(4, 'A206325', 'Lucas Kiess 2', '416.840.360-20', 'Rua da Ospa, 350 - São Lucas - Viamão', '94450-360', '52.00', '2019-11-09'),
(5, 'C25656', 'Mariazinha', '582.369.798-45', 'Rua Yal ali', '94452-360', '60.00', '2019-11-02'),
(8, 'as', 'sasa', '555.555.555-55', 'saoijoi', '66666-666', '50.00', '2019-11-01'),
(9, 'teste', 'teste', '666.666.666-66', 'esse é u teste de endereço pra ver se vai retornar outubro', '85236-987', '60.00', '2019-10-08');

-- --------------------------------------------------------

--
-- Estrutura da tabela `poa`
--

CREATE TABLE `poa` (
  `codExame` int(11) NOT NULL,
  `nomeExame` varchar(80) NOT NULL,
  `valorExame` decimal(6,2) NOT NULL,
  `obsExame` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `poa`
--

INSERT INTO `poa` (`codExame`, `nomeExame`, `valorExame`, `obsExame`) VALUES
(21, 'CP Colo Uterino', '120.00', ''),
(22, 'Cito-hormonal Simples', '120.00', ''),
(23, 'Cito-hormonal Seriado', '160.00', ''),
(24, 'CP Líquidos', '160.00', ''),
(25, 'Congelação', '800.00', ''),
(26, 'CP Uretral', '160.00', ''),
(27, 'Imuno-Histoquimica', '380.00', '1 anticorpo'),
(28, 'Imuno-Histoquimica', '770.00', '2 ou mais anticorpos'),
(29, 'Receptores de Estrógeno e Progesterona', '660.00', ''),
(30, 'Painel de avaliação do câncer de mama', '660.00', ''),
(31, 'Genotipagem para HPV', '350.00', ''),
(32, 'Chlamydia por biologia molecular', '250.00', ''),
(33, 'Teste de ALK por IHC', '1400.00', ''),
(34, 'Teste de PDL-1 por IHC', '740.00', ''),
(35, 'Biópsia endoscópica de estômago, reto, brônquio, pleura, laringe', '360.00', ''),
(36, 'Punção biópsia de próstata', '360.00', ''),
(37, 'Endométrio para investigação de esterilidade', '360.00', ''),
(38, 'Biópsia pele', '360.00', '360,00 por lesão'),
(39, 'Bexiga, cérvice, mucosa oral, apêndice cecal, vesícula biliar', '360.00', ''),
(40, 'Curetagem uterina, nódulo subcutâneo, anexo uterino, nódulo de mama, tumores SNC', '360.00', 'SNC = sistema nervoso central'),
(41, 'Punçao biópsia rim, fígado', '590.00', ''),
(42, 'Conização', '590.00', ''),
(43, 'Revisão de Lâminas', '590.00', ''),
(44, 'Osso, medula óssea e linfonodos', '590.00', ''),
(45, 'Próstata, ressecção endoscópica (RTU) ou prostatectomia', '590.00', ''),
(46, 'Mamoplastia', '590.00', ''),
(47, 'Útero com e sem anexos', '590.00', ''),
(48, 'Tireóide', '590.00', ''),
(49, 'Útero com anexos e linfonodos (Werthein-Meigs)', '590.00', ''),
(50, 'Estômago com linfonodos', '590.00', ''),
(51, 'Amputação de membros', '590.00', ''),
(52, 'Pulmão', '590.00', ''),
(53, 'Esofagectomia', '590.00', ''),
(54, 'Bacterioscópico', '35.00', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `poaipe`
--

CREATE TABLE `poaipe` (
  `codExame` int(11) NOT NULL,
  `nomeExame` varchar(80) NOT NULL,
  `categoriaExame` varchar(1) NOT NULL,
  `valorExame` decimal(5,2) NOT NULL,
  `obsExame` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `poaipe`
--

INSERT INTO `poaipe` (`codExame`, `nomeExame`, `categoriaExame`, `valorExame`, `obsExame`) VALUES
(1, 'Citopatológico de Colo Uterino', '1', '1.10', 'Se paciente for pensionista, não há taxa'),
(2, 'Citopatológico de Colo Uterino', '2', '2.15', ''),
(3, 'Citopatológico de Colo Uterino', '3', '4.30', ''),
(4, 'Citopatológico de Colo Uterino', '4', '6.45', ''),
(5, 'Citopatológico de Colo Uterino', '5', '8.60', ''),
(6, 'Cito-hormonal Simples', '1', '0.90', ''),
(7, 'Cito-hormonal Simples', '2', '1.80', ''),
(8, 'Cito-hormonal Simples', '3', '3.65', ''),
(9, 'Cito-hormonal Simples', '4', '5.45', ''),
(10, 'Cito-hormonal Simples', '5', '7.25', ''),
(11, 'Cito-hormonal Seriado', '1', '1.95', ''),
(12, 'Cito-hormonal Seriado', '2', '3.90', ''),
(13, 'Cito-hormonal Seriado', '3', '7.85', ''),
(14, 'Cito-hormonal Seriado', '4', '11.75', ''),
(15, 'Cito-hormonal Seriado', '5', '15.70', ''),
(16, 'Bacterioscópico', '1', '0.25', ''),
(17, 'Bacterioscópico', '2', '0.50', ''),
(18, 'Bacterioscópico', '3', '1.00', ''),
(19, 'Bacterioscópico', '4', '1.50', ''),
(20, 'Bacterioscópico', '5', '2.00', ''),
(21, 'Exame a fresco', '1', '0.25', ''),
(22, 'Exame a fresco', '2', '0.50', ''),
(23, 'Exame a fresco', '3', '1.00', ''),
(24, 'Exame a fresco', '4', '1.50', ''),
(25, 'Exame a fresco', '5', '2.00', ''),
(26, 'Painel de avaliação do câncer de mama e imuno-histoquimica', '1', '14.60', ''),
(27, 'Painel de avaliação do câncer de mama e imuno-histoquimica', '2', '29.15', ''),
(28, 'Painel de avaliação do câncer de mama e imuno-histoquimica', '3', '58.30', ''),
(29, 'Painel de avaliação do câncer de mama e imuno-histoquimica', '4', '87.45', ''),
(30, 'Painel de avaliação do câncer de mama e imuno-histoquimica', '5', '116.60', ''),
(31, 'Citopatológico de Líquidos', '1', '1.55', ''),
(32, 'Citopatológico de Líquidos', '2', '3.10', ''),
(33, 'Citopatológico de Líquidos', '3', '6.15', ''),
(34, 'Citopatológico de Líquidos', '4', '9.25', ''),
(35, 'Citopatológico de Líquidos', '5', '12.30', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `saidamaterial`
--

CREATE TABLE `saidamaterial` (
  `codSaida` int(11) NOT NULL,
  `descricaoMaterialS` varchar(30) NOT NULL,
  `quantidadeSaida` int(2) NOT NULL,
  `dataSaida` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `saidamaterial`
--

INSERT INTO `saidamaterial` (`codSaida`, `descricaoMaterialS`, `quantidadeSaida`, `dataSaida`) VALUES
(39, 'Frasco Pequeno', 2, '2019-11-08'),
(40, 'Frasco Pequeno', 2, '2019-11-08'),
(41, 'Frasco Médio', 20, '2019-11-08'),
(42, 'Frasco Grande', 20, '2019-11-08'),
(43, 'Envelope CP', 20, '2019-11-08'),
(44, 'Lâmina', 20, '2019-11-08'),
(45, 'Requisição CP', 20, '2019-11-08'),
(46, 'Fixador', 3, '2019-11-08'),
(47, 'Escova Cervical', 20, '2019-11-08'),
(48, 'Espátula de Ayre', 30, '2019-11-08');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `codUsu` int(11) NOT NULL,
  `loginUsu` varchar(20) NOT NULL,
  `senhaUsu` varchar(20) NOT NULL,
  `empresa` varchar(50) NOT NULL,
  `cnpj` varchar(18) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`codUsu`, `loginUsu`, `senhaUsu`, `empresa`, `cnpj`) VALUES
(1, 'admin', 'patosis2019', 'Patologistas Reunidos Serviços Médicos Ltda', '92.947.662/0001-91'),
(2, 'patocolab', 'patocolab2019', '', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `viamao`
--

CREATE TABLE `viamao` (
  `codExame` int(11) NOT NULL,
  `nomeExame` varchar(80) NOT NULL,
  `valorExame` decimal(6,2) NOT NULL,
  `obsExame` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `viamao`
--

INSERT INTO `viamao` (`codExame`, `nomeExame`, `valorExame`, `obsExame`) VALUES
(11, 'CP Colo Uterino', '60.00', 'Drs Lucia, Karen, Fabiane, Caio, Flávio'),
(12, 'CP Colo Uterino', '30.00', 'Guyas, AFPERGS'),
(13, 'Cito-hormonal Simples', '60.00', ''),
(14, 'Cito-hormonal Seriado', '80.00', ''),
(15, 'CP Líquidos', '150.00', ''),
(16, 'Congelação', '800.00', '700,00 se pac. pedir desconto'),
(17, 'CP Uretral', '150.00', ''),
(18, 'Imuno-Histoquimica', '350.00', '1 anticorpo'),
(19, 'Imuno-Histoquimica', '700.00', '2 ou mais anticorpos'),
(20, 'Receptores de Estrógeno e Progesterona', '600.00', ''),
(21, 'Painel de avaliação do câncer de mama', '600.00', ''),
(22, 'Genotipagem para HPV', '350.00', ''),
(23, 'Chlamydia por biologia molecular', '250.00', ''),
(24, 'Teste de ALK por IHC', '1400.00', ''),
(25, 'Teste de PDL-1 por IHC', '740.00', ''),
(26, 'Biópsia endoscópica de estômago, reto, brônquio, pleura, laringe', '200.00', ''),
(27, 'Punção biópsia de próstata', '200.00', ''),
(28, 'Endométrio para investigação de estirilidade', '200.00', ''),
(29, 'Biópsia de pele', '200.00', '200,00 por lesão'),
(30, 'Bexiga, cérvice, mucosa oral, apêndice cecal, vesícula biliar', '200.00', ''),
(31, 'Curetagem uterina, nódulo subcutâneo, anexo uterino, nódulo de mama, tumores SNC', '200.00', 'SNC = sistema nervoso central'),
(32, 'Punção biópsia rim, fígado', '300.00', ''),
(33, 'Conização', '300.00', ''),
(34, 'Revisão de Lâminas', '300.00', 'Paciente deve trazer as lâminas a serem revisadas'),
(35, 'Osso, medula óssea e linfônodos ', '300.00', ''),
(36, 'Próstata, ressecção endoscópica (RTU) ou prostatectomia ', '300.00', ''),
(37, 'Mamoplastia', '300.00', ''),
(38, 'Útero com e sem anexos', '300.00', ''),
(39, 'Tireóide', '300.00', ''),
(40, 'Útero com anexos e linfonôdos (Werthen-Meigs)', '300.00', ''),
(41, 'Estômago com linfonodos', '300.00', ''),
(42, 'Amputação de membros', '300.00', ''),
(43, 'Pulmão', '300.00', ''),
(44, 'Esofagectomia', '300.00', ''),
(45, 'Bacterioscópico', '30.00', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `viamaoipe`
--

CREATE TABLE `viamaoipe` (
  `codExame` int(11) NOT NULL,
  `nomeExame` varchar(80) NOT NULL,
  `categoriaExame` varchar(1) NOT NULL,
  `valorExame` decimal(5,2) NOT NULL,
  `obsExame` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `viamaoipe`
--

INSERT INTO `viamaoipe` (`codExame`, `nomeExame`, `categoriaExame`, `valorExame`, `obsExame`) VALUES
(4, 'Citopatológico de Colo Uterino', '2', '2.15', ''),
(5, 'Citopatológico de Colo Uterino', '1', '1.10', 'Se paciente pensionista, não há taxa'),
(6, 'Citopatológico de Colo Uterino', '3', '4.30', ''),
(7, 'Citopatológico de Colo Uterino', '4', '6.45', ''),
(8, 'Citopatológico de Colo Uterino', '5', '8.60', ''),
(9, 'Cito-hormonal Simples', '1', '0.90', ''),
(10, 'Cito-hormonal Simples', '2', '1.80', ''),
(11, 'Cito-hormonal Simples', '3', '3.65', ''),
(12, 'Cito-hormonal Simples', '5', '5.45', ''),
(13, 'Cito-hormonal Simples', '5', '7.25', ''),
(14, 'Cito-hormonal Seriado', '1', '1.95', ''),
(15, 'Cito-hormonal Seriado', '2', '3.90', ''),
(16, 'Cito-hormonal Seriado', '3', '7.85', ''),
(17, 'Cito-hormonal Seriado', '4', '11.75', ''),
(18, 'Cito-hormonal Seriado', '5', '15.70', ''),
(19, 'Bacterioscópico', '1', '0.25', ''),
(20, 'Bacterioscópico', '2', '0.50', ''),
(21, 'Bacterioscópico', '3', '1.00', ''),
(22, 'Bacterioscópico', '4', '1.50', ''),
(23, 'Bacterioscópico', '5', '2.00', ''),
(24, 'Citopatológico de Líquidos', '1', '1.55', ''),
(25, 'Citopatológico de Líquidos', '2', '3.10', ''),
(26, 'Citopatológico de Líquidos', '3', '6.15', ''),
(27, 'Citopatológico de Líquidos', '4', '9.25', ''),
(28, 'Citopatológico de Líquidos', '5', '12.30', ''),
(29, 'Painel de avaliação do câncer de mama e imuno', '1', '14.60', ''),
(30, 'Painel de avaliação do câncer de mama e imuno', '2', '29.15', ''),
(31, 'Painel de avaliação do câncer de mama e imuno', '3', '58.30', ''),
(32, 'Painel de avaliação do câncer de mama e imuno', '4', '87.45', ''),
(33, 'Painel de avaliação do câncer de mama e imuno', '5', '116.60', '');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `caixaemprestimo`
--
ALTER TABLE `caixaemprestimo`
  ADD PRIMARY KEY (`codEmprestimo`);

--
-- Índices para tabela `caixaentrada`
--
ALTER TABLE `caixaentrada`
  ADD PRIMARY KEY (`codCaixaEntrada`);

--
-- Índices para tabela `caixasaida`
--
ALTER TABLE `caixasaida`
  ADD PRIMARY KEY (`codCaixaSaida`);

--
-- Índices para tabela `entradamaterial`
--
ALTER TABLE `entradamaterial`
  ADD PRIMARY KEY (`codEntrada`);

--
-- Índices para tabela `estoquematerial`
--
ALTER TABLE `estoquematerial`
  ADD PRIMARY KEY (`codMaterial`);

--
-- Índices para tabela `listatelefone`
--
ALTER TABLE `listatelefone`
  ADD PRIMARY KEY (`codTelefone`);

--
-- Índices para tabela `pagamentocartao`
--
ALTER TABLE `pagamentocartao`
  ADD PRIMARY KEY (`codPagamento`);

--
-- Índices para tabela `poa`
--
ALTER TABLE `poa`
  ADD PRIMARY KEY (`codExame`);

--
-- Índices para tabela `poaipe`
--
ALTER TABLE `poaipe`
  ADD PRIMARY KEY (`codExame`);

--
-- Índices para tabela `saidamaterial`
--
ALTER TABLE `saidamaterial`
  ADD PRIMARY KEY (`codSaida`);

--
-- Índices para tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`codUsu`);

--
-- Índices para tabela `viamao`
--
ALTER TABLE `viamao`
  ADD PRIMARY KEY (`codExame`);

--
-- Índices para tabela `viamaoipe`
--
ALTER TABLE `viamaoipe`
  ADD PRIMARY KEY (`codExame`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `caixaemprestimo`
--
ALTER TABLE `caixaemprestimo`
  MODIFY `codEmprestimo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `caixaentrada`
--
ALTER TABLE `caixaentrada`
  MODIFY `codCaixaEntrada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=148;

--
-- AUTO_INCREMENT de tabela `caixasaida`
--
ALTER TABLE `caixasaida`
  MODIFY `codCaixaSaida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT de tabela `entradamaterial`
--
ALTER TABLE `entradamaterial`
  MODIFY `codEntrada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT de tabela `estoquematerial`
--
ALTER TABLE `estoquematerial`
  MODIFY `codMaterial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `listatelefone`
--
ALTER TABLE `listatelefone`
  MODIFY `codTelefone` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT de tabela `pagamentocartao`
--
ALTER TABLE `pagamentocartao`
  MODIFY `codPagamento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de tabela `poa`
--
ALTER TABLE `poa`
  MODIFY `codExame` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT de tabela `poaipe`
--
ALTER TABLE `poaipe`
  MODIFY `codExame` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT de tabela `saidamaterial`
--
ALTER TABLE `saidamaterial`
  MODIFY `codSaida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT de tabela `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `codUsu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `viamao`
--
ALTER TABLE `viamao`
  MODIFY `codExame` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT de tabela `viamaoipe`
--
ALTER TABLE `viamaoipe`
  MODIFY `codExame` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
