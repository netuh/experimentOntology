/**
 */
package experimentOntology.planning.threats;

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
 * @see experimentOntology.planning.threats.ThreatsFactory
 * @model kind="package"
 * @generated
 */
public interface ThreatsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "threats";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/threats";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "threats";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThreatsPackage eINSTANCE = experimentOntology.planning.threats.impl.ThreatsPackageImpl.init();

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.ThreatsImpl <em>Threats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.ThreatsImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getThreats()
	 * @generated
	 */
	int THREATS = 0;

	/**
	 * The feature id for the '<em><b>Threat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREATS__THREAT = 0;

	/**
	 * The number of structural features of the '<em>Threats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREATS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Threats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREATS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.ThreatImpl <em>Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.ThreatImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getThreat()
	 * @generated
	 */
	int THREAT = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__ACTION = 0;

	/**
	 * The number of structural features of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.InternalThreatImpl <em>Internal Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.InternalThreatImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInternalThreat()
	 * @generated
	 */
	int INTERNAL_THREAT = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_THREAT__ACTION = THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Internal Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_THREAT_FEATURE_COUNT = THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_THREAT_OPERATION_COUNT = THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.ConclusionThreatImpl <em>Conclusion Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.ConclusionThreatImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getConclusionThreat()
	 * @generated
	 */
	int CONCLUSION_THREAT = 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION_THREAT__ACTION = THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Conclusion Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION_THREAT_FEATURE_COUNT = THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conclusion Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION_THREAT_OPERATION_COUNT = THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.ConstructTreatImpl <em>Construct Treat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.ConstructTreatImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getConstructTreat()
	 * @generated
	 */
	int CONSTRUCT_TREAT = 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_TREAT__ACTION = THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Construct Treat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_TREAT_FEATURE_COUNT = THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Construct Treat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_TREAT_OPERATION_COUNT = THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.ExternalThreatImpl <em>External Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.ExternalThreatImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getExternalThreat()
	 * @generated
	 */
	int EXTERNAL_THREAT = 5;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__ACTION = THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>External Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT_FEATURE_COUNT = THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT_OPERATION_COUNT = THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.DiffusionOfImitationImpl <em>Diffusion Of Imitation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.DiffusionOfImitationImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getDiffusionOfImitation()
	 * @generated
	 */
	int DIFFUSION_OF_IMITATION = 6;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFUSION_OF_IMITATION__ACTION = INTERNAL_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Diffusion Of Imitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFUSION_OF_IMITATION_FEATURE_COUNT = INTERNAL_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diffusion Of Imitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFUSION_OF_IMITATION_OPERATION_COUNT = INTERNAL_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.MortalityImpl <em>Mortality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.MortalityImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getMortality()
	 * @generated
	 */
	int MORTALITY = 7;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORTALITY__ACTION = INTERNAL_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Mortality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORTALITY_FEATURE_COUNT = INTERNAL_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mortality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORTALITY_OPERATION_COUNT = INTERNAL_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.HistoryImpl <em>History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.HistoryImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getHistory()
	 * @generated
	 */
	int HISTORY = 8;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__ACTION = INTERNAL_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_FEATURE_COUNT = INTERNAL_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OPERATION_COUNT = INTERNAL_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.AmbiguityImpl <em>Ambiguity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.AmbiguityImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getAmbiguity()
	 * @generated
	 */
	int AMBIGUITY = 9;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIGUITY__ACTION = INTERNAL_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Ambiguity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIGUITY_FEATURE_COUNT = INTERNAL_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ambiguity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIGUITY_OPERATION_COUNT = INTERNAL_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.InteractionWithSelectionImpl <em>Interaction With Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.InteractionWithSelectionImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInteractionWithSelection()
	 * @generated
	 */
	int INTERACTION_WITH_SELECTION = 10;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_WITH_SELECTION__ACTION = INTERNAL_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Interaction With Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_WITH_SELECTION_FEATURE_COUNT = INTERNAL_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interaction With Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_WITH_SELECTION_OPERATION_COUNT = INTERNAL_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.SelectionImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 11;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__ACTION = INTERNAL_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = INTERNAL_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_OPERATION_COUNT = INTERNAL_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.InstrumentationImpl <em>Instrumentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.InstrumentationImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInstrumentation()
	 * @generated
	 */
	int INSTRUMENTATION = 12;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTATION__ACTION = INTERNAL_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Instrumentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTATION_FEATURE_COUNT = INTERNAL_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instrumentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTATION_OPERATION_COUNT = INTERNAL_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.MaturationImpl <em>Maturation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.MaturationImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getMaturation()
	 * @generated
	 */
	int MATURATION = 13;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURATION__ACTION = INTERNAL_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Maturation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURATION_FEATURE_COUNT = INTERNAL_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Maturation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURATION_OPERATION_COUNT = INTERNAL_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.ResentfulDemoralizationImpl <em>Resentful Demoralization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.ResentfulDemoralizationImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getResentfulDemoralization()
	 * @generated
	 */
	int RESENTFUL_DEMORALIZATION = 14;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESENTFUL_DEMORALIZATION__ACTION = INTERNAL_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Resentful Demoralization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESENTFUL_DEMORALIZATION_FEATURE_COUNT = INTERNAL_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resentful Demoralization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESENTFUL_DEMORALIZATION_OPERATION_COUNT = INTERNAL_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.StatisticalRegretionImpl <em>Statistical Regretion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.StatisticalRegretionImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getStatisticalRegretion()
	 * @generated
	 */
	int STATISTICAL_REGRETION = 15;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_REGRETION__ACTION = INTERNAL_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Statistical Regretion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_REGRETION_FEATURE_COUNT = INTERNAL_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statistical Regretion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_REGRETION_OPERATION_COUNT = INTERNAL_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.CompensatoryRivalityImpl <em>Compensatory Rivality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.CompensatoryRivalityImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getCompensatoryRivality()
	 * @generated
	 */
	int COMPENSATORY_RIVALITY = 16;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATORY_RIVALITY__ACTION = INTERNAL_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Compensatory Rivality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATORY_RIVALITY_FEATURE_COUNT = INTERNAL_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compensatory Rivality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATORY_RIVALITY_OPERATION_COUNT = INTERNAL_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.InteractionWithSettingImpl <em>Interaction With Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.InteractionWithSettingImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInteractionWithSetting()
	 * @generated
	 */
	int INTERACTION_WITH_SETTING = 17;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_WITH_SETTING__ACTION = EXTERNAL_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Interaction With Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_WITH_SETTING_FEATURE_COUNT = EXTERNAL_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interaction With Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_WITH_SETTING_OPERATION_COUNT = EXTERNAL_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.InteractionOfHistoryImpl <em>Interaction Of History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.InteractionOfHistoryImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInteractionOfHistory()
	 * @generated
	 */
	int INTERACTION_OF_HISTORY = 18;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OF_HISTORY__ACTION = EXTERNAL_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Interaction Of History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OF_HISTORY_FEATURE_COUNT = EXTERNAL_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interaction Of History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OF_HISTORY_OPERATION_COUNT = EXTERNAL_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.InteractionOfSelectionImpl <em>Interaction Of Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.InteractionOfSelectionImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInteractionOfSelection()
	 * @generated
	 */
	int INTERACTION_OF_SELECTION = 19;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OF_SELECTION__ACTION = EXTERNAL_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Interaction Of Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OF_SELECTION_FEATURE_COUNT = EXTERNAL_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interaction Of Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OF_SELECTION_OPERATION_COUNT = EXTERNAL_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.RelialibilityOfMeasuresImpl <em>Relialibility Of Measures</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.RelialibilityOfMeasuresImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getRelialibilityOfMeasures()
	 * @generated
	 */
	int RELIALIBILITY_OF_MEASURES = 20;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIALIBILITY_OF_MEASURES__ACTION = CONCLUSION_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Relialibility Of Measures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIALIBILITY_OF_MEASURES_FEATURE_COUNT = CONCLUSION_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relialibility Of Measures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIALIBILITY_OF_MEASURES_OPERATION_COUNT = CONCLUSION_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.LowStatisticalPowerImpl <em>Low Statistical Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.LowStatisticalPowerImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getLowStatisticalPower()
	 * @generated
	 */
	int LOW_STATISTICAL_POWER = 21;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_STATISTICAL_POWER__ACTION = CONCLUSION_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Low Statistical Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_STATISTICAL_POWER_FEATURE_COUNT = CONCLUSION_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Low Statistical Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_STATISTICAL_POWER_OPERATION_COUNT = CONCLUSION_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.RelizabilityOfTreatmentImpl <em>Relizability Of Treatment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.RelizabilityOfTreatmentImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getRelizabilityOfTreatment()
	 * @generated
	 */
	int RELIZABILITY_OF_TREATMENT = 22;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIZABILITY_OF_TREATMENT__ACTION = CONCLUSION_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Relizability Of Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIZABILITY_OF_TREATMENT_FEATURE_COUNT = CONCLUSION_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relizability Of Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIZABILITY_OF_TREATMENT_OPERATION_COUNT = CONCLUSION_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.RandomIrrelevanceImpl <em>Random Irrelevance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.RandomIrrelevanceImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getRandomIrrelevance()
	 * @generated
	 */
	int RANDOM_IRRELEVANCE = 23;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_IRRELEVANCE__ACTION = CONCLUSION_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Random Irrelevance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_IRRELEVANCE_FEATURE_COUNT = CONCLUSION_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Random Irrelevance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_IRRELEVANCE_OPERATION_COUNT = CONCLUSION_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.FishingAndErrorRateImpl <em>Fishing And Error Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.FishingAndErrorRateImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getFishingAndErrorRate()
	 * @generated
	 */
	int FISHING_AND_ERROR_RATE = 24;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISHING_AND_ERROR_RATE__ACTION = CONCLUSION_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Fishing And Error Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISHING_AND_ERROR_RATE_FEATURE_COUNT = CONCLUSION_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fishing And Error Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISHING_AND_ERROR_RATE_OPERATION_COUNT = CONCLUSION_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.ViolatedAssumptionImpl <em>Violated Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.ViolatedAssumptionImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getViolatedAssumption()
	 * @generated
	 */
	int VIOLATED_ASSUMPTION = 25;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATED_ASSUMPTION__ACTION = CONCLUSION_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Violated Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATED_ASSUMPTION_FEATURE_COUNT = CONCLUSION_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Violated Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATED_ASSUMPTION_OPERATION_COUNT = CONCLUSION_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.RandomHeteriogenityImpl <em>Random Heteriogenity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.RandomHeteriogenityImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getRandomHeteriogenity()
	 * @generated
	 */
	int RANDOM_HETERIOGENITY = 26;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_HETERIOGENITY__ACTION = CONCLUSION_THREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Random Heteriogenity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_HETERIOGENITY_FEATURE_COUNT = CONCLUSION_THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Random Heteriogenity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_HETERIOGENITY_OPERATION_COUNT = CONCLUSION_THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.InadequadePreoperationImpl <em>Inadequade Preoperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.InadequadePreoperationImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInadequadePreoperation()
	 * @generated
	 */
	int INADEQUADE_PREOPERATION = 27;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADEQUADE_PREOPERATION__ACTION = CONSTRUCT_TREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Inadequade Preoperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADEQUADE_PREOPERATION_FEATURE_COUNT = CONSTRUCT_TREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inadequade Preoperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INADEQUADE_PREOPERATION_OPERATION_COUNT = CONSTRUCT_TREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.ExperimenterExpectationImpl <em>Experimenter Expectation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.ExperimenterExpectationImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getExperimenterExpectation()
	 * @generated
	 */
	int EXPERIMENTER_EXPECTATION = 28;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_EXPECTATION__ACTION = CONSTRUCT_TREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Experimenter Expectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_EXPECTATION_FEATURE_COUNT = CONSTRUCT_TREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Experimenter Expectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_EXPECTATION_OPERATION_COUNT = CONSTRUCT_TREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.RestrictedGeneralizationImpl <em>Restricted Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.RestrictedGeneralizationImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getRestrictedGeneralization()
	 * @generated
	 */
	int RESTRICTED_GENERALIZATION = 29;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_GENERALIZATION__ACTION = CONSTRUCT_TREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Restricted Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_GENERALIZATION_FEATURE_COUNT = CONSTRUCT_TREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Restricted Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_GENERALIZATION_OPERATION_COUNT = CONSTRUCT_TREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.InteractionOfTestingImpl <em>Interaction Of Testing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.InteractionOfTestingImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInteractionOfTesting()
	 * @generated
	 */
	int INTERACTION_OF_TESTING = 30;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OF_TESTING__ACTION = CONSTRUCT_TREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Interaction Of Testing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OF_TESTING_FEATURE_COUNT = CONSTRUCT_TREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interaction Of Testing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OF_TESTING_OPERATION_COUNT = CONSTRUCT_TREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.HipothesisGuessingImpl <em>Hipothesis Guessing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.HipothesisGuessingImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getHipothesisGuessing()
	 * @generated
	 */
	int HIPOTHESIS_GUESSING = 31;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIPOTHESIS_GUESSING__ACTION = CONSTRUCT_TREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Hipothesis Guessing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIPOTHESIS_GUESSING_FEATURE_COUNT = CONSTRUCT_TREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hipothesis Guessing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIPOTHESIS_GUESSING_OPERATION_COUNT = CONSTRUCT_TREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.EvaluationAppreensionImpl <em>Evaluation Appreension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.EvaluationAppreensionImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getEvaluationAppreension()
	 * @generated
	 */
	int EVALUATION_APPREENSION = 32;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_APPREENSION__ACTION = CONSTRUCT_TREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Evaluation Appreension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_APPREENSION_FEATURE_COUNT = CONSTRUCT_TREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evaluation Appreension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_APPREENSION_OPERATION_COUNT = CONSTRUCT_TREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.MonoMethodBiasImpl <em>Mono Method Bias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.MonoMethodBiasImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getMonoMethodBias()
	 * @generated
	 */
	int MONO_METHOD_BIAS = 33;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_METHOD_BIAS__ACTION = CONSTRUCT_TREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Mono Method Bias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_METHOD_BIAS_FEATURE_COUNT = CONSTRUCT_TREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mono Method Bias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_METHOD_BIAS_OPERATION_COUNT = CONSTRUCT_TREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.ConfoundingConstructImpl <em>Confounding Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.ConfoundingConstructImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getConfoundingConstruct()
	 * @generated
	 */
	int CONFOUNDING_CONSTRUCT = 34;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFOUNDING_CONSTRUCT__ACTION = CONSTRUCT_TREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Confounding Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFOUNDING_CONSTRUCT_FEATURE_COUNT = CONSTRUCT_TREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Confounding Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFOUNDING_CONSTRUCT_OPERATION_COUNT = CONSTRUCT_TREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.MonoOperationBiasImpl <em>Mono Operation Bias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.MonoOperationBiasImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getMonoOperationBias()
	 * @generated
	 */
	int MONO_OPERATION_BIAS = 35;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_OPERATION_BIAS__ACTION = CONSTRUCT_TREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Mono Operation Bias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_OPERATION_BIAS_FEATURE_COUNT = CONSTRUCT_TREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mono Operation Bias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_OPERATION_BIAS_OPERATION_COUNT = CONSTRUCT_TREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.InteractionOfDifferentsImpl <em>Interaction Of Differents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.InteractionOfDifferentsImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInteractionOfDifferents()
	 * @generated
	 */
	int INTERACTION_OF_DIFFERENTS = 36;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OF_DIFFERENTS__ACTION = CONSTRUCT_TREAT__ACTION;

	/**
	 * The number of structural features of the '<em>Interaction Of Differents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OF_DIFFERENTS_FEATURE_COUNT = CONSTRUCT_TREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interaction Of Differents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OF_DIFFERENTS_OPERATION_COUNT = CONSTRUCT_TREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.threats.impl.MitigationActionImpl <em>Mitigation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.threats.impl.MitigationActionImpl
	 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getMitigationAction()
	 * @generated
	 */
	int MITIGATION_ACTION = 37;

	/**
	 * The number of structural features of the '<em>Mitigation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATION_ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mitigation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATION_ACTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.Threats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threats</em>'.
	 * @see experimentOntology.planning.threats.Threats
	 * @generated
	 */
	EClass getThreats();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.planning.threats.Threats#getThreat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threat</em>'.
	 * @see experimentOntology.planning.threats.Threats#getThreat()
	 * @see #getThreats()
	 * @generated
	 */
	EReference getThreats_Threat();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat</em>'.
	 * @see experimentOntology.planning.threats.Threat
	 * @generated
	 */
	EClass getThreat();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.planning.threats.Threat#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see experimentOntology.planning.threats.Threat#getAction()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Action();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.InternalThreat <em>Internal Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Threat</em>'.
	 * @see experimentOntology.planning.threats.InternalThreat
	 * @generated
	 */
	EClass getInternalThreat();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.ConclusionThreat <em>Conclusion Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conclusion Threat</em>'.
	 * @see experimentOntology.planning.threats.ConclusionThreat
	 * @generated
	 */
	EClass getConclusionThreat();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.ConstructTreat <em>Construct Treat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Construct Treat</em>'.
	 * @see experimentOntology.planning.threats.ConstructTreat
	 * @generated
	 */
	EClass getConstructTreat();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.ExternalThreat <em>External Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Threat</em>'.
	 * @see experimentOntology.planning.threats.ExternalThreat
	 * @generated
	 */
	EClass getExternalThreat();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.DiffusionOfImitation <em>Diffusion Of Imitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diffusion Of Imitation</em>'.
	 * @see experimentOntology.planning.threats.DiffusionOfImitation
	 * @generated
	 */
	EClass getDiffusionOfImitation();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.Mortality <em>Mortality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mortality</em>'.
	 * @see experimentOntology.planning.threats.Mortality
	 * @generated
	 */
	EClass getMortality();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.History <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History</em>'.
	 * @see experimentOntology.planning.threats.History
	 * @generated
	 */
	EClass getHistory();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.Ambiguity <em>Ambiguity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ambiguity</em>'.
	 * @see experimentOntology.planning.threats.Ambiguity
	 * @generated
	 */
	EClass getAmbiguity();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.InteractionWithSelection <em>Interaction With Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction With Selection</em>'.
	 * @see experimentOntology.planning.threats.InteractionWithSelection
	 * @generated
	 */
	EClass getInteractionWithSelection();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see experimentOntology.planning.threats.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.Instrumentation <em>Instrumentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instrumentation</em>'.
	 * @see experimentOntology.planning.threats.Instrumentation
	 * @generated
	 */
	EClass getInstrumentation();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.Maturation <em>Maturation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maturation</em>'.
	 * @see experimentOntology.planning.threats.Maturation
	 * @generated
	 */
	EClass getMaturation();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.ResentfulDemoralization <em>Resentful Demoralization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resentful Demoralization</em>'.
	 * @see experimentOntology.planning.threats.ResentfulDemoralization
	 * @generated
	 */
	EClass getResentfulDemoralization();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.StatisticalRegretion <em>Statistical Regretion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistical Regretion</em>'.
	 * @see experimentOntology.planning.threats.StatisticalRegretion
	 * @generated
	 */
	EClass getStatisticalRegretion();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.CompensatoryRivality <em>Compensatory Rivality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compensatory Rivality</em>'.
	 * @see experimentOntology.planning.threats.CompensatoryRivality
	 * @generated
	 */
	EClass getCompensatoryRivality();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.InteractionWithSetting <em>Interaction With Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction With Setting</em>'.
	 * @see experimentOntology.planning.threats.InteractionWithSetting
	 * @generated
	 */
	EClass getInteractionWithSetting();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.InteractionOfHistory <em>Interaction Of History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Of History</em>'.
	 * @see experimentOntology.planning.threats.InteractionOfHistory
	 * @generated
	 */
	EClass getInteractionOfHistory();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.InteractionOfSelection <em>Interaction Of Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Of Selection</em>'.
	 * @see experimentOntology.planning.threats.InteractionOfSelection
	 * @generated
	 */
	EClass getInteractionOfSelection();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.RelialibilityOfMeasures <em>Relialibility Of Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relialibility Of Measures</em>'.
	 * @see experimentOntology.planning.threats.RelialibilityOfMeasures
	 * @generated
	 */
	EClass getRelialibilityOfMeasures();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.LowStatisticalPower <em>Low Statistical Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Low Statistical Power</em>'.
	 * @see experimentOntology.planning.threats.LowStatisticalPower
	 * @generated
	 */
	EClass getLowStatisticalPower();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.RelizabilityOfTreatment <em>Relizability Of Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relizability Of Treatment</em>'.
	 * @see experimentOntology.planning.threats.RelizabilityOfTreatment
	 * @generated
	 */
	EClass getRelizabilityOfTreatment();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.RandomIrrelevance <em>Random Irrelevance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Irrelevance</em>'.
	 * @see experimentOntology.planning.threats.RandomIrrelevance
	 * @generated
	 */
	EClass getRandomIrrelevance();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.FishingAndErrorRate <em>Fishing And Error Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fishing And Error Rate</em>'.
	 * @see experimentOntology.planning.threats.FishingAndErrorRate
	 * @generated
	 */
	EClass getFishingAndErrorRate();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.ViolatedAssumption <em>Violated Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Violated Assumption</em>'.
	 * @see experimentOntology.planning.threats.ViolatedAssumption
	 * @generated
	 */
	EClass getViolatedAssumption();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.RandomHeteriogenity <em>Random Heteriogenity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Heteriogenity</em>'.
	 * @see experimentOntology.planning.threats.RandomHeteriogenity
	 * @generated
	 */
	EClass getRandomHeteriogenity();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.InadequadePreoperation <em>Inadequade Preoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inadequade Preoperation</em>'.
	 * @see experimentOntology.planning.threats.InadequadePreoperation
	 * @generated
	 */
	EClass getInadequadePreoperation();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.ExperimenterExpectation <em>Experimenter Expectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimenter Expectation</em>'.
	 * @see experimentOntology.planning.threats.ExperimenterExpectation
	 * @generated
	 */
	EClass getExperimenterExpectation();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.RestrictedGeneralization <em>Restricted Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restricted Generalization</em>'.
	 * @see experimentOntology.planning.threats.RestrictedGeneralization
	 * @generated
	 */
	EClass getRestrictedGeneralization();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.InteractionOfTesting <em>Interaction Of Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Of Testing</em>'.
	 * @see experimentOntology.planning.threats.InteractionOfTesting
	 * @generated
	 */
	EClass getInteractionOfTesting();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.HipothesisGuessing <em>Hipothesis Guessing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hipothesis Guessing</em>'.
	 * @see experimentOntology.planning.threats.HipothesisGuessing
	 * @generated
	 */
	EClass getHipothesisGuessing();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.EvaluationAppreension <em>Evaluation Appreension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Appreension</em>'.
	 * @see experimentOntology.planning.threats.EvaluationAppreension
	 * @generated
	 */
	EClass getEvaluationAppreension();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.MonoMethodBias <em>Mono Method Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mono Method Bias</em>'.
	 * @see experimentOntology.planning.threats.MonoMethodBias
	 * @generated
	 */
	EClass getMonoMethodBias();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.ConfoundingConstruct <em>Confounding Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confounding Construct</em>'.
	 * @see experimentOntology.planning.threats.ConfoundingConstruct
	 * @generated
	 */
	EClass getConfoundingConstruct();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.MonoOperationBias <em>Mono Operation Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mono Operation Bias</em>'.
	 * @see experimentOntology.planning.threats.MonoOperationBias
	 * @generated
	 */
	EClass getMonoOperationBias();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.InteractionOfDifferents <em>Interaction Of Differents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Of Differents</em>'.
	 * @see experimentOntology.planning.threats.InteractionOfDifferents
	 * @generated
	 */
	EClass getInteractionOfDifferents();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.threats.MitigationAction <em>Mitigation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mitigation Action</em>'.
	 * @see experimentOntology.planning.threats.MitigationAction
	 * @generated
	 */
	EClass getMitigationAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ThreatsFactory getThreatsFactory();

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
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.ThreatsImpl <em>Threats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.ThreatsImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getThreats()
		 * @generated
		 */
		EClass THREATS = eINSTANCE.getThreats();

		/**
		 * The meta object literal for the '<em><b>Threat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREATS__THREAT = eINSTANCE.getThreats_Threat();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.ThreatImpl <em>Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.ThreatImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getThreat()
		 * @generated
		 */
		EClass THREAT = eINSTANCE.getThreat();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__ACTION = eINSTANCE.getThreat_Action();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.InternalThreatImpl <em>Internal Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.InternalThreatImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInternalThreat()
		 * @generated
		 */
		EClass INTERNAL_THREAT = eINSTANCE.getInternalThreat();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.ConclusionThreatImpl <em>Conclusion Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.ConclusionThreatImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getConclusionThreat()
		 * @generated
		 */
		EClass CONCLUSION_THREAT = eINSTANCE.getConclusionThreat();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.ConstructTreatImpl <em>Construct Treat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.ConstructTreatImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getConstructTreat()
		 * @generated
		 */
		EClass CONSTRUCT_TREAT = eINSTANCE.getConstructTreat();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.ExternalThreatImpl <em>External Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.ExternalThreatImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getExternalThreat()
		 * @generated
		 */
		EClass EXTERNAL_THREAT = eINSTANCE.getExternalThreat();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.DiffusionOfImitationImpl <em>Diffusion Of Imitation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.DiffusionOfImitationImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getDiffusionOfImitation()
		 * @generated
		 */
		EClass DIFFUSION_OF_IMITATION = eINSTANCE.getDiffusionOfImitation();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.MortalityImpl <em>Mortality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.MortalityImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getMortality()
		 * @generated
		 */
		EClass MORTALITY = eINSTANCE.getMortality();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.HistoryImpl <em>History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.HistoryImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getHistory()
		 * @generated
		 */
		EClass HISTORY = eINSTANCE.getHistory();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.AmbiguityImpl <em>Ambiguity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.AmbiguityImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getAmbiguity()
		 * @generated
		 */
		EClass AMBIGUITY = eINSTANCE.getAmbiguity();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.InteractionWithSelectionImpl <em>Interaction With Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.InteractionWithSelectionImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInteractionWithSelection()
		 * @generated
		 */
		EClass INTERACTION_WITH_SELECTION = eINSTANCE.getInteractionWithSelection();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.SelectionImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.InstrumentationImpl <em>Instrumentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.InstrumentationImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInstrumentation()
		 * @generated
		 */
		EClass INSTRUMENTATION = eINSTANCE.getInstrumentation();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.MaturationImpl <em>Maturation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.MaturationImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getMaturation()
		 * @generated
		 */
		EClass MATURATION = eINSTANCE.getMaturation();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.ResentfulDemoralizationImpl <em>Resentful Demoralization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.ResentfulDemoralizationImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getResentfulDemoralization()
		 * @generated
		 */
		EClass RESENTFUL_DEMORALIZATION = eINSTANCE.getResentfulDemoralization();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.StatisticalRegretionImpl <em>Statistical Regretion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.StatisticalRegretionImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getStatisticalRegretion()
		 * @generated
		 */
		EClass STATISTICAL_REGRETION = eINSTANCE.getStatisticalRegretion();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.CompensatoryRivalityImpl <em>Compensatory Rivality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.CompensatoryRivalityImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getCompensatoryRivality()
		 * @generated
		 */
		EClass COMPENSATORY_RIVALITY = eINSTANCE.getCompensatoryRivality();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.InteractionWithSettingImpl <em>Interaction With Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.InteractionWithSettingImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInteractionWithSetting()
		 * @generated
		 */
		EClass INTERACTION_WITH_SETTING = eINSTANCE.getInteractionWithSetting();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.InteractionOfHistoryImpl <em>Interaction Of History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.InteractionOfHistoryImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInteractionOfHistory()
		 * @generated
		 */
		EClass INTERACTION_OF_HISTORY = eINSTANCE.getInteractionOfHistory();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.InteractionOfSelectionImpl <em>Interaction Of Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.InteractionOfSelectionImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInteractionOfSelection()
		 * @generated
		 */
		EClass INTERACTION_OF_SELECTION = eINSTANCE.getInteractionOfSelection();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.RelialibilityOfMeasuresImpl <em>Relialibility Of Measures</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.RelialibilityOfMeasuresImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getRelialibilityOfMeasures()
		 * @generated
		 */
		EClass RELIALIBILITY_OF_MEASURES = eINSTANCE.getRelialibilityOfMeasures();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.LowStatisticalPowerImpl <em>Low Statistical Power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.LowStatisticalPowerImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getLowStatisticalPower()
		 * @generated
		 */
		EClass LOW_STATISTICAL_POWER = eINSTANCE.getLowStatisticalPower();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.RelizabilityOfTreatmentImpl <em>Relizability Of Treatment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.RelizabilityOfTreatmentImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getRelizabilityOfTreatment()
		 * @generated
		 */
		EClass RELIZABILITY_OF_TREATMENT = eINSTANCE.getRelizabilityOfTreatment();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.RandomIrrelevanceImpl <em>Random Irrelevance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.RandomIrrelevanceImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getRandomIrrelevance()
		 * @generated
		 */
		EClass RANDOM_IRRELEVANCE = eINSTANCE.getRandomIrrelevance();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.FishingAndErrorRateImpl <em>Fishing And Error Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.FishingAndErrorRateImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getFishingAndErrorRate()
		 * @generated
		 */
		EClass FISHING_AND_ERROR_RATE = eINSTANCE.getFishingAndErrorRate();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.ViolatedAssumptionImpl <em>Violated Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.ViolatedAssumptionImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getViolatedAssumption()
		 * @generated
		 */
		EClass VIOLATED_ASSUMPTION = eINSTANCE.getViolatedAssumption();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.RandomHeteriogenityImpl <em>Random Heteriogenity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.RandomHeteriogenityImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getRandomHeteriogenity()
		 * @generated
		 */
		EClass RANDOM_HETERIOGENITY = eINSTANCE.getRandomHeteriogenity();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.InadequadePreoperationImpl <em>Inadequade Preoperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.InadequadePreoperationImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInadequadePreoperation()
		 * @generated
		 */
		EClass INADEQUADE_PREOPERATION = eINSTANCE.getInadequadePreoperation();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.ExperimenterExpectationImpl <em>Experimenter Expectation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.ExperimenterExpectationImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getExperimenterExpectation()
		 * @generated
		 */
		EClass EXPERIMENTER_EXPECTATION = eINSTANCE.getExperimenterExpectation();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.RestrictedGeneralizationImpl <em>Restricted Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.RestrictedGeneralizationImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getRestrictedGeneralization()
		 * @generated
		 */
		EClass RESTRICTED_GENERALIZATION = eINSTANCE.getRestrictedGeneralization();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.InteractionOfTestingImpl <em>Interaction Of Testing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.InteractionOfTestingImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInteractionOfTesting()
		 * @generated
		 */
		EClass INTERACTION_OF_TESTING = eINSTANCE.getInteractionOfTesting();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.HipothesisGuessingImpl <em>Hipothesis Guessing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.HipothesisGuessingImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getHipothesisGuessing()
		 * @generated
		 */
		EClass HIPOTHESIS_GUESSING = eINSTANCE.getHipothesisGuessing();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.EvaluationAppreensionImpl <em>Evaluation Appreension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.EvaluationAppreensionImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getEvaluationAppreension()
		 * @generated
		 */
		EClass EVALUATION_APPREENSION = eINSTANCE.getEvaluationAppreension();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.MonoMethodBiasImpl <em>Mono Method Bias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.MonoMethodBiasImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getMonoMethodBias()
		 * @generated
		 */
		EClass MONO_METHOD_BIAS = eINSTANCE.getMonoMethodBias();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.ConfoundingConstructImpl <em>Confounding Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.ConfoundingConstructImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getConfoundingConstruct()
		 * @generated
		 */
		EClass CONFOUNDING_CONSTRUCT = eINSTANCE.getConfoundingConstruct();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.MonoOperationBiasImpl <em>Mono Operation Bias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.MonoOperationBiasImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getMonoOperationBias()
		 * @generated
		 */
		EClass MONO_OPERATION_BIAS = eINSTANCE.getMonoOperationBias();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.InteractionOfDifferentsImpl <em>Interaction Of Differents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.InteractionOfDifferentsImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getInteractionOfDifferents()
		 * @generated
		 */
		EClass INTERACTION_OF_DIFFERENTS = eINSTANCE.getInteractionOfDifferents();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.threats.impl.MitigationActionImpl <em>Mitigation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.threats.impl.MitigationActionImpl
		 * @see experimentOntology.planning.threats.impl.ThreatsPackageImpl#getMitigationAction()
		 * @generated
		 */
		EClass MITIGATION_ACTION = eINSTANCE.getMitigationAction();

	}

} //ThreatsPackage
