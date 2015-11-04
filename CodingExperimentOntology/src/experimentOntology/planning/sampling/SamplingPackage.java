/**
 */
package experimentOntology.planning.sampling;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see experimentOntology.planning.sampling.SamplingFactory
 * @model kind="package"
 * @generated
 */
public interface SamplingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sampling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sampling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sampling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SamplingPackage eINSTANCE = experimentOntology.planning.sampling.impl.SamplingPackageImpl.init();

	/**
	 * The meta object id for the '{@link experimentOntology.planning.sampling.impl.SamplingStrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.sampling.impl.SamplingStrategyImpl
	 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getSamplingStrategy()
	 * @generated
	 */
	int SAMPLING_STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_STRATEGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.sampling.impl.ProbabilityTechiniqueImpl <em>Probability Techinique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.sampling.impl.ProbabilityTechiniqueImpl
	 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getProbabilityTechinique()
	 * @generated
	 */
	int PROBABILITY_TECHINIQUE = 1;

	/**
	 * The feature id for the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_TECHINIQUE__POPULATION = SAMPLING_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Probability Techinique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_TECHINIQUE_FEATURE_COUNT = SAMPLING_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Probability Techinique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_TECHINIQUE_OPERATION_COUNT = SAMPLING_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.sampling.impl.SimpleRandomTechiniqueImpl <em>Simple Random Techinique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.sampling.impl.SimpleRandomTechiniqueImpl
	 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getSimpleRandomTechinique()
	 * @generated
	 */
	int SIMPLE_RANDOM_TECHINIQUE = 2;

	/**
	 * The feature id for the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANDOM_TECHINIQUE__POPULATION = PROBABILITY_TECHINIQUE__POPULATION;

	/**
	 * The number of structural features of the '<em>Simple Random Techinique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANDOM_TECHINIQUE_FEATURE_COUNT = PROBABILITY_TECHINIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Random Techinique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RANDOM_TECHINIQUE_OPERATION_COUNT = PROBABILITY_TECHINIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.sampling.impl.SystematicTechiniqueImpl <em>Systematic Techinique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.sampling.impl.SystematicTechiniqueImpl
	 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getSystematicTechinique()
	 * @generated
	 */
	int SYSTEMATIC_TECHINIQUE = 3;

	/**
	 * The feature id for the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMATIC_TECHINIQUE__POPULATION = PROBABILITY_TECHINIQUE__POPULATION;

	/**
	 * The number of structural features of the '<em>Systematic Techinique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMATIC_TECHINIQUE_FEATURE_COUNT = PROBABILITY_TECHINIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Systematic Techinique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMATIC_TECHINIQUE_OPERATION_COUNT = PROBABILITY_TECHINIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.sampling.impl.StratifiedRandomSamplingTechiniqueImpl <em>Stratified Random Sampling Techinique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.sampling.impl.StratifiedRandomSamplingTechiniqueImpl
	 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getStratifiedRandomSamplingTechinique()
	 * @generated
	 */
	int STRATIFIED_RANDOM_SAMPLING_TECHINIQUE = 4;

	/**
	 * The feature id for the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATIFIED_RANDOM_SAMPLING_TECHINIQUE__POPULATION = PROBABILITY_TECHINIQUE__POPULATION;

	/**
	 * The number of structural features of the '<em>Stratified Random Sampling Techinique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATIFIED_RANDOM_SAMPLING_TECHINIQUE_FEATURE_COUNT = PROBABILITY_TECHINIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stratified Random Sampling Techinique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATIFIED_RANDOM_SAMPLING_TECHINIQUE_OPERATION_COUNT = PROBABILITY_TECHINIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.sampling.impl.NoProbabilityTechiniqueImpl <em>No Probability Techinique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.sampling.impl.NoProbabilityTechiniqueImpl
	 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getNoProbabilityTechinique()
	 * @generated
	 */
	int NO_PROBABILITY_TECHINIQUE = 5;

	/**
	 * The number of structural features of the '<em>No Probability Techinique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_PROBABILITY_TECHINIQUE_FEATURE_COUNT = SAMPLING_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Probability Techinique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_PROBABILITY_TECHINIQUE_OPERATION_COUNT = SAMPLING_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.sampling.impl.ConvenienceSamplingImpl <em>Convenience Sampling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.sampling.impl.ConvenienceSamplingImpl
	 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getConvenienceSampling()
	 * @generated
	 */
	int CONVENIENCE_SAMPLING = 6;

	/**
	 * The number of structural features of the '<em>Convenience Sampling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVENIENCE_SAMPLING_FEATURE_COUNT = NO_PROBABILITY_TECHINIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Convenience Sampling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVENIENCE_SAMPLING_OPERATION_COUNT = NO_PROBABILITY_TECHINIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.sampling.impl.QuoteSamplingImpl <em>Quote Sampling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.sampling.impl.QuoteSamplingImpl
	 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getQuoteSampling()
	 * @generated
	 */
	int QUOTE_SAMPLING = 7;

	/**
	 * The number of structural features of the '<em>Quote Sampling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_SAMPLING_FEATURE_COUNT = NO_PROBABILITY_TECHINIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quote Sampling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_SAMPLING_OPERATION_COUNT = NO_PROBABILITY_TECHINIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.sampling.impl.PopulationDescriptionImpl <em>Population Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.sampling.impl.PopulationDescriptionImpl
	 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getPopulationDescription()
	 * @generated
	 */
	int POPULATION_DESCRIPTION = 8;

	/**
	 * The number of structural features of the '<em>Population Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_DESCRIPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Population Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_DESCRIPTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.sampling.SamplingStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see experimentOntology.planning.sampling.SamplingStrategy
	 * @generated
	 */
	EClass getSamplingStrategy();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.sampling.ProbabilityTechinique <em>Probability Techinique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probability Techinique</em>'.
	 * @see experimentOntology.planning.sampling.ProbabilityTechinique
	 * @generated
	 */
	EClass getProbabilityTechinique();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.planning.sampling.ProbabilityTechinique#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Population</em>'.
	 * @see experimentOntology.planning.sampling.ProbabilityTechinique#getPopulation()
	 * @see #getProbabilityTechinique()
	 * @generated
	 */
	EReference getProbabilityTechinique_Population();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.sampling.SimpleRandomTechinique <em>Simple Random Techinique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Random Techinique</em>'.
	 * @see experimentOntology.planning.sampling.SimpleRandomTechinique
	 * @generated
	 */
	EClass getSimpleRandomTechinique();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.sampling.SystematicTechinique <em>Systematic Techinique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systematic Techinique</em>'.
	 * @see experimentOntology.planning.sampling.SystematicTechinique
	 * @generated
	 */
	EClass getSystematicTechinique();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.sampling.StratifiedRandomSamplingTechinique <em>Stratified Random Sampling Techinique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stratified Random Sampling Techinique</em>'.
	 * @see experimentOntology.planning.sampling.StratifiedRandomSamplingTechinique
	 * @generated
	 */
	EClass getStratifiedRandomSamplingTechinique();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.sampling.NoProbabilityTechinique <em>No Probability Techinique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Probability Techinique</em>'.
	 * @see experimentOntology.planning.sampling.NoProbabilityTechinique
	 * @generated
	 */
	EClass getNoProbabilityTechinique();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.sampling.ConvenienceSampling <em>Convenience Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convenience Sampling</em>'.
	 * @see experimentOntology.planning.sampling.ConvenienceSampling
	 * @generated
	 */
	EClass getConvenienceSampling();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.sampling.QuoteSampling <em>Quote Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quote Sampling</em>'.
	 * @see experimentOntology.planning.sampling.QuoteSampling
	 * @generated
	 */
	EClass getQuoteSampling();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.sampling.PopulationDescription <em>Population Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population Description</em>'.
	 * @see experimentOntology.planning.sampling.PopulationDescription
	 * @generated
	 */
	EClass getPopulationDescription();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SamplingFactory getSamplingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link experimentOntology.planning.sampling.impl.SamplingStrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.sampling.impl.SamplingStrategyImpl
		 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getSamplingStrategy()
		 * @generated
		 */
		EClass SAMPLING_STRATEGY = eINSTANCE.getSamplingStrategy();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.sampling.impl.ProbabilityTechiniqueImpl <em>Probability Techinique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.sampling.impl.ProbabilityTechiniqueImpl
		 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getProbabilityTechinique()
		 * @generated
		 */
		EClass PROBABILITY_TECHINIQUE = eINSTANCE.getProbabilityTechinique();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBABILITY_TECHINIQUE__POPULATION = eINSTANCE.getProbabilityTechinique_Population();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.sampling.impl.SimpleRandomTechiniqueImpl <em>Simple Random Techinique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.sampling.impl.SimpleRandomTechiniqueImpl
		 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getSimpleRandomTechinique()
		 * @generated
		 */
		EClass SIMPLE_RANDOM_TECHINIQUE = eINSTANCE.getSimpleRandomTechinique();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.sampling.impl.SystematicTechiniqueImpl <em>Systematic Techinique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.sampling.impl.SystematicTechiniqueImpl
		 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getSystematicTechinique()
		 * @generated
		 */
		EClass SYSTEMATIC_TECHINIQUE = eINSTANCE.getSystematicTechinique();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.sampling.impl.StratifiedRandomSamplingTechiniqueImpl <em>Stratified Random Sampling Techinique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.sampling.impl.StratifiedRandomSamplingTechiniqueImpl
		 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getStratifiedRandomSamplingTechinique()
		 * @generated
		 */
		EClass STRATIFIED_RANDOM_SAMPLING_TECHINIQUE = eINSTANCE.getStratifiedRandomSamplingTechinique();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.sampling.impl.NoProbabilityTechiniqueImpl <em>No Probability Techinique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.sampling.impl.NoProbabilityTechiniqueImpl
		 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getNoProbabilityTechinique()
		 * @generated
		 */
		EClass NO_PROBABILITY_TECHINIQUE = eINSTANCE.getNoProbabilityTechinique();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.sampling.impl.ConvenienceSamplingImpl <em>Convenience Sampling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.sampling.impl.ConvenienceSamplingImpl
		 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getConvenienceSampling()
		 * @generated
		 */
		EClass CONVENIENCE_SAMPLING = eINSTANCE.getConvenienceSampling();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.sampling.impl.QuoteSamplingImpl <em>Quote Sampling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.sampling.impl.QuoteSamplingImpl
		 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getQuoteSampling()
		 * @generated
		 */
		EClass QUOTE_SAMPLING = eINSTANCE.getQuoteSampling();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.sampling.impl.PopulationDescriptionImpl <em>Population Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.sampling.impl.PopulationDescriptionImpl
		 * @see experimentOntology.planning.sampling.impl.SamplingPackageImpl#getPopulationDescription()
		 * @generated
		 */
		EClass POPULATION_DESCRIPTION = eINSTANCE.getPopulationDescription();

	}

} //SamplingPackage
