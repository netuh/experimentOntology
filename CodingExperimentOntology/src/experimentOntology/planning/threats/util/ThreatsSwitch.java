/**
 */
package experimentOntology.planning.threats.util;

import experimentOntology.planning.threats.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see experimentOntology.planning.threats.ThreatsPackage
 * @generated
 */
public class ThreatsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ThreatsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatsSwitch() {
		if (modelPackage == null) {
			modelPackage = ThreatsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ThreatsPackage.THREATS: {
				Threats threats = (Threats)theEObject;
				T result = caseThreats(threats);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.THREAT: {
				Threat threat = (Threat)theEObject;
				T result = caseThreat(threat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.INTERNAL_THREAT: {
				InternalThreat internalThreat = (InternalThreat)theEObject;
				T result = caseInternalThreat(internalThreat);
				if (result == null) result = caseThreat(internalThreat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.CONCLUSION_THREAT: {
				ConclusionThreat conclusionThreat = (ConclusionThreat)theEObject;
				T result = caseConclusionThreat(conclusionThreat);
				if (result == null) result = caseThreat(conclusionThreat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.CONSTRUCT_TREAT: {
				ConstructTreat constructTreat = (ConstructTreat)theEObject;
				T result = caseConstructTreat(constructTreat);
				if (result == null) result = caseThreat(constructTreat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.EXTERNAL_THREAT: {
				ExternalThreat externalThreat = (ExternalThreat)theEObject;
				T result = caseExternalThreat(externalThreat);
				if (result == null) result = caseThreat(externalThreat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.DIFFUSION_OF_IMITATION: {
				DiffusionOfImitation diffusionOfImitation = (DiffusionOfImitation)theEObject;
				T result = caseDiffusionOfImitation(diffusionOfImitation);
				if (result == null) result = caseInternalThreat(diffusionOfImitation);
				if (result == null) result = caseThreat(diffusionOfImitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.MORTALITY: {
				Mortality mortality = (Mortality)theEObject;
				T result = caseMortality(mortality);
				if (result == null) result = caseInternalThreat(mortality);
				if (result == null) result = caseThreat(mortality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.HISTORY: {
				History history = (History)theEObject;
				T result = caseHistory(history);
				if (result == null) result = caseInternalThreat(history);
				if (result == null) result = caseThreat(history);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.AMBIGUITY: {
				Ambiguity ambiguity = (Ambiguity)theEObject;
				T result = caseAmbiguity(ambiguity);
				if (result == null) result = caseInternalThreat(ambiguity);
				if (result == null) result = caseThreat(ambiguity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.INTERACTION_WITH_SELECTION: {
				InteractionWithSelection interactionWithSelection = (InteractionWithSelection)theEObject;
				T result = caseInteractionWithSelection(interactionWithSelection);
				if (result == null) result = caseInternalThreat(interactionWithSelection);
				if (result == null) result = caseThreat(interactionWithSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.SELECTION: {
				Selection selection = (Selection)theEObject;
				T result = caseSelection(selection);
				if (result == null) result = caseInternalThreat(selection);
				if (result == null) result = caseThreat(selection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.INSTRUMENTATION: {
				Instrumentation instrumentation = (Instrumentation)theEObject;
				T result = caseInstrumentation(instrumentation);
				if (result == null) result = caseInternalThreat(instrumentation);
				if (result == null) result = caseThreat(instrumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.MATURATION: {
				Maturation maturation = (Maturation)theEObject;
				T result = caseMaturation(maturation);
				if (result == null) result = caseInternalThreat(maturation);
				if (result == null) result = caseThreat(maturation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.RESENTFUL_DEMORALIZATION: {
				ResentfulDemoralization resentfulDemoralization = (ResentfulDemoralization)theEObject;
				T result = caseResentfulDemoralization(resentfulDemoralization);
				if (result == null) result = caseInternalThreat(resentfulDemoralization);
				if (result == null) result = caseThreat(resentfulDemoralization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.STATISTICAL_REGRETION: {
				StatisticalRegretion statisticalRegretion = (StatisticalRegretion)theEObject;
				T result = caseStatisticalRegretion(statisticalRegretion);
				if (result == null) result = caseInternalThreat(statisticalRegretion);
				if (result == null) result = caseThreat(statisticalRegretion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.COMPENSATORY_RIVALITY: {
				CompensatoryRivality compensatoryRivality = (CompensatoryRivality)theEObject;
				T result = caseCompensatoryRivality(compensatoryRivality);
				if (result == null) result = caseInternalThreat(compensatoryRivality);
				if (result == null) result = caseThreat(compensatoryRivality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.INTERACTION_WITH_SETTING: {
				InteractionWithSetting interactionWithSetting = (InteractionWithSetting)theEObject;
				T result = caseInteractionWithSetting(interactionWithSetting);
				if (result == null) result = caseExternalThreat(interactionWithSetting);
				if (result == null) result = caseThreat(interactionWithSetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.INTERACTION_OF_HISTORY: {
				InteractionOfHistory interactionOfHistory = (InteractionOfHistory)theEObject;
				T result = caseInteractionOfHistory(interactionOfHistory);
				if (result == null) result = caseExternalThreat(interactionOfHistory);
				if (result == null) result = caseThreat(interactionOfHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.INTERACTION_OF_SELECTION: {
				InteractionOfSelection interactionOfSelection = (InteractionOfSelection)theEObject;
				T result = caseInteractionOfSelection(interactionOfSelection);
				if (result == null) result = caseExternalThreat(interactionOfSelection);
				if (result == null) result = caseThreat(interactionOfSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.RELIALIBILITY_OF_MEASURES: {
				RelialibilityOfMeasures relialibilityOfMeasures = (RelialibilityOfMeasures)theEObject;
				T result = caseRelialibilityOfMeasures(relialibilityOfMeasures);
				if (result == null) result = caseConclusionThreat(relialibilityOfMeasures);
				if (result == null) result = caseThreat(relialibilityOfMeasures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.LOW_STATISTICAL_POWER: {
				LowStatisticalPower lowStatisticalPower = (LowStatisticalPower)theEObject;
				T result = caseLowStatisticalPower(lowStatisticalPower);
				if (result == null) result = caseConclusionThreat(lowStatisticalPower);
				if (result == null) result = caseThreat(lowStatisticalPower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.RELIZABILITY_OF_TREATMENT: {
				RelizabilityOfTreatment relizabilityOfTreatment = (RelizabilityOfTreatment)theEObject;
				T result = caseRelizabilityOfTreatment(relizabilityOfTreatment);
				if (result == null) result = caseConclusionThreat(relizabilityOfTreatment);
				if (result == null) result = caseThreat(relizabilityOfTreatment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.RANDOM_IRRELEVANCE: {
				RandomIrrelevance randomIrrelevance = (RandomIrrelevance)theEObject;
				T result = caseRandomIrrelevance(randomIrrelevance);
				if (result == null) result = caseConclusionThreat(randomIrrelevance);
				if (result == null) result = caseThreat(randomIrrelevance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.FISHING_AND_ERROR_RATE: {
				FishingAndErrorRate fishingAndErrorRate = (FishingAndErrorRate)theEObject;
				T result = caseFishingAndErrorRate(fishingAndErrorRate);
				if (result == null) result = caseConclusionThreat(fishingAndErrorRate);
				if (result == null) result = caseThreat(fishingAndErrorRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.VIOLATED_ASSUMPTION: {
				ViolatedAssumption violatedAssumption = (ViolatedAssumption)theEObject;
				T result = caseViolatedAssumption(violatedAssumption);
				if (result == null) result = caseConclusionThreat(violatedAssumption);
				if (result == null) result = caseThreat(violatedAssumption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.RANDOM_HETERIOGENITY: {
				RandomHeteriogenity randomHeteriogenity = (RandomHeteriogenity)theEObject;
				T result = caseRandomHeteriogenity(randomHeteriogenity);
				if (result == null) result = caseConclusionThreat(randomHeteriogenity);
				if (result == null) result = caseThreat(randomHeteriogenity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.INADEQUADE_PREOPERATION: {
				InadequadePreoperation inadequadePreoperation = (InadequadePreoperation)theEObject;
				T result = caseInadequadePreoperation(inadequadePreoperation);
				if (result == null) result = caseConstructTreat(inadequadePreoperation);
				if (result == null) result = caseThreat(inadequadePreoperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.EXPERIMENTER_EXPECTATION: {
				ExperimenterExpectation experimenterExpectation = (ExperimenterExpectation)theEObject;
				T result = caseExperimenterExpectation(experimenterExpectation);
				if (result == null) result = caseConstructTreat(experimenterExpectation);
				if (result == null) result = caseThreat(experimenterExpectation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.RESTRICTED_GENERALIZATION: {
				RestrictedGeneralization restrictedGeneralization = (RestrictedGeneralization)theEObject;
				T result = caseRestrictedGeneralization(restrictedGeneralization);
				if (result == null) result = caseConstructTreat(restrictedGeneralization);
				if (result == null) result = caseThreat(restrictedGeneralization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.INTERACTION_OF_TESTING: {
				InteractionOfTesting interactionOfTesting = (InteractionOfTesting)theEObject;
				T result = caseInteractionOfTesting(interactionOfTesting);
				if (result == null) result = caseConstructTreat(interactionOfTesting);
				if (result == null) result = caseThreat(interactionOfTesting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.HIPOTHESIS_GUESSING: {
				HipothesisGuessing hipothesisGuessing = (HipothesisGuessing)theEObject;
				T result = caseHipothesisGuessing(hipothesisGuessing);
				if (result == null) result = caseConstructTreat(hipothesisGuessing);
				if (result == null) result = caseThreat(hipothesisGuessing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.EVALUATION_APPREENSION: {
				EvaluationAppreension evaluationAppreension = (EvaluationAppreension)theEObject;
				T result = caseEvaluationAppreension(evaluationAppreension);
				if (result == null) result = caseConstructTreat(evaluationAppreension);
				if (result == null) result = caseThreat(evaluationAppreension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.MONO_METHOD_BIAS: {
				MonoMethodBias monoMethodBias = (MonoMethodBias)theEObject;
				T result = caseMonoMethodBias(monoMethodBias);
				if (result == null) result = caseConstructTreat(monoMethodBias);
				if (result == null) result = caseThreat(monoMethodBias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.CONFOUNDING_CONSTRUCT: {
				ConfoundingConstruct confoundingConstruct = (ConfoundingConstruct)theEObject;
				T result = caseConfoundingConstruct(confoundingConstruct);
				if (result == null) result = caseConstructTreat(confoundingConstruct);
				if (result == null) result = caseThreat(confoundingConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.MONO_OPERATION_BIAS: {
				MonoOperationBias monoOperationBias = (MonoOperationBias)theEObject;
				T result = caseMonoOperationBias(monoOperationBias);
				if (result == null) result = caseConstructTreat(monoOperationBias);
				if (result == null) result = caseThreat(monoOperationBias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.INTERACTION_OF_DIFFERENTS: {
				InteractionOfDifferents interactionOfDifferents = (InteractionOfDifferents)theEObject;
				T result = caseInteractionOfDifferents(interactionOfDifferents);
				if (result == null) result = caseConstructTreat(interactionOfDifferents);
				if (result == null) result = caseThreat(interactionOfDifferents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ThreatsPackage.MITIGATION_ACTION: {
				MitigationAction mitigationAction = (MitigationAction)theEObject;
				T result = caseMitigationAction(mitigationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threats</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threats</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreats(Threats object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreat(Threat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Threat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Threat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalThreat(InternalThreat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conclusion Threat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conclusion Threat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConclusionThreat(ConclusionThreat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Construct Treat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Construct Treat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructTreat(ConstructTreat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Threat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Threat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalThreat(ExternalThreat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diffusion Of Imitation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diffusion Of Imitation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffusionOfImitation(DiffusionOfImitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mortality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mortality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMortality(Mortality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistory(History object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ambiguity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ambiguity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmbiguity(Ambiguity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction With Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction With Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionWithSelection(InteractionWithSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelection(Selection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instrumentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instrumentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstrumentation(Instrumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maturation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maturation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaturation(Maturation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resentful Demoralization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resentful Demoralization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResentfulDemoralization(ResentfulDemoralization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistical Regretion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistical Regretion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatisticalRegretion(StatisticalRegretion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compensatory Rivality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compensatory Rivality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompensatoryRivality(CompensatoryRivality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction With Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction With Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionWithSetting(InteractionWithSetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Of History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Of History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionOfHistory(InteractionOfHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Of Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Of Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionOfSelection(InteractionOfSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relialibility Of Measures</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relialibility Of Measures</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelialibilityOfMeasures(RelialibilityOfMeasures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Low Statistical Power</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Low Statistical Power</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowStatisticalPower(LowStatisticalPower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relizability Of Treatment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relizability Of Treatment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelizabilityOfTreatment(RelizabilityOfTreatment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Irrelevance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Irrelevance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomIrrelevance(RandomIrrelevance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fishing And Error Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fishing And Error Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFishingAndErrorRate(FishingAndErrorRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Violated Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Violated Assumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViolatedAssumption(ViolatedAssumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Heteriogenity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Heteriogenity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomHeteriogenity(RandomHeteriogenity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inadequade Preoperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inadequade Preoperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInadequadePreoperation(InadequadePreoperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experimenter Expectation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experimenter Expectation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimenterExpectation(ExperimenterExpectation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restricted Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restricted Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictedGeneralization(RestrictedGeneralization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Of Testing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Of Testing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionOfTesting(InteractionOfTesting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hipothesis Guessing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hipothesis Guessing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHipothesisGuessing(HipothesisGuessing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Appreension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Appreension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationAppreension(EvaluationAppreension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mono Method Bias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mono Method Bias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonoMethodBias(MonoMethodBias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confounding Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confounding Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfoundingConstruct(ConfoundingConstruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mono Operation Bias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mono Operation Bias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonoOperationBias(MonoOperationBias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Of Differents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Of Differents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionOfDifferents(InteractionOfDifferents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mitigation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mitigation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMitigationAction(MitigationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ThreatsSwitch
